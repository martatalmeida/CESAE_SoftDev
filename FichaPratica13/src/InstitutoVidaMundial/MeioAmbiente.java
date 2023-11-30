package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.AlimentacaoDieta;
import InstitutoVidaMundial.Enums.FamiliaPlanta;

import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {

    private String nome;
    private double aguaLitros;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double aguaLitros) {
        this.nome = nome;
        this.aguaLitros = aguaLitros;
        this.seres = new ArrayList<SerVivo>();
    }

    public void adicionarSerVivo(SerVivo serVivo){
        seres.add(serVivo);
    }

    public void removerSerVivo(int indexSerVivo){
        seres.remove(indexSerVivo);
    }

    public boolean plantaBebe(int indexPlanta){
        SerVivo serVivoAtual = this.seres.get(indexPlanta);
        boolean bebe = true;

        if (serVivoAtual instanceof Planta) {
            Planta plantaAtual = (Planta) serVivoAtual;

            if (plantaAtual.getFamilia() == FamiliaPlanta.Arvores){
                if(this.aguaLitros >= 1){
                    this.aguaLitros--;
                } else{
                    bebe = false;
                    removerSerVivo(indexPlanta);
                }
            }

            if (plantaAtual.getFamilia() == FamiliaPlanta.Ervas){
                if(this.aguaLitros >= 0.25){
                    this.aguaLitros -= 0.25;
                } else{
                    bebe = false;
                    removerSerVivo(indexPlanta);
                }
            }

            if (plantaAtual.getFamilia() == FamiliaPlanta.Flores){
                if(this.aguaLitros >= 0.1){
                    this.aguaLitros -= 0.1;
                } else{
                    bebe = false;
                    removerSerVivo(indexPlanta);
                }
            }
        }
        if(bebe){
            System.out.println("A planta bebeu");
            return true;
        }else {
            return false;
        }
    }

    public boolean plantaComeInsetos(int indexPlanta){
        SerVivo serVivoAtual = this.seres.get(indexPlanta);
        int insetos =0;
        boolean come = true;

        if(serVivoAtual instanceof Planta){
            Planta plantaAtual = (Planta) serVivoAtual;

            if(plantaAtual.getFamilia() == FamiliaPlanta.Come_Insetos){
                for (int i = 0; i < seres.size(); i++){
                    if (seres.get(i) instanceof Inseto){
                        insetos++;
                    }
                }
                if (insetos >= 1){
                    come = true;
                } else {
                    come = false;
                    seres.remove(indexPlanta);
                }
            }
        }
        if (come){
            System.out.println("A planta comeu inseto");
            return true;
        } else {
            return false;
        }
    }

    public void plantaAbanaComVento(int indexPlanta){
        System.out.println("Está muito vento");
    }

    public void animalFazBarulho(int indexAnimal){
        SerVivo serVivoAtual = this.seres.get(indexAnimal);
        if (serVivoAtual instanceof Animal){
            Animal animalAtual = (Animal) serVivoAtual;
            System.out.println(animalAtual.getBarulho());
        }
    }

    public void animalMovimenta(int indexAnimal){
        if (this.seres.get(indexAnimal) instanceof Animal){
            System.out.println("O " + this.seres.get(indexAnimal).getNome() + " movimentou-se.");
        }
    }

    public boolean animalBebe(int indexAnimal){
        SerVivo serVivoAtual = this.seres.get(indexAnimal);
        boolean bebe = true;

        if (serVivoAtual instanceof Animal) {
            Animal animalAtual = (Animal) serVivoAtual;
            double quantidadeAguaAnimal = animalAtual.getPesoKg() * 0.025;
            if (quantidadeAguaAnimal <= aguaLitros){
                aguaLitros -= quantidadeAguaAnimal;
            } else {
                bebe = false;
                removerSerVivo(indexAnimal);
            }
        }
        if (bebe){
            System.out.println("O animal bebeu");
            return true;
        }else{
            return false;
        }
    }
    
    public boolean animalCome(int indexAnimal){
        SerVivo serVivoAtual = this.seres.get(indexAnimal);
        boolean come = true;

        if (serVivoAtual instanceof Animal){
            Animal animalAtual = (Animal) serVivoAtual;
            double inteligencia = animalAtual.getInteligencia();
            double capacidade = animalAtual.getPesoKg() * (2.5*inteligencia);

            if(animalAtual.isFome()){

                if (animalAtual.getAlimentacao() == AlimentacaoDieta.Carnivoro){

                    for (int i = 0; i < seres.size(); i++){
                        if (seres.get(i) instanceof Animal){
                            double capacidadeOutroAnimal = ((Animal) seres.get(i)).getPesoKg() * (2.5*((Animal) seres.get(i)).getInteligencia());

                            if (capacidade > capacidadeOutroAnimal){
                                System.out.println(seres.get(i).getNome() + " Foi Comido");
                                removerSerVivo(i);
                                animalAtual.setFome(false);
                                come = true;
                                break;
                            } else {
                                come = false;
                            }
                        }
                        if (seres.get(i) instanceof Inseto){
                            if (((Inseto) seres.get(i)).isVenenoso()){
                                removerSerVivo(indexAnimal);
                                come = false;
                                break;
                            } else {
                                removerSerVivo(i);
                                animalAtual.setFome(false);
                                come = true;
                                break;
                            }
                        }
                    }
                }

                if (animalAtual.getAlimentacao() == AlimentacaoDieta.Herbivoro){

                    for (int i = 0; i < seres.size(); i++) {
                        if (seres.get(i) instanceof Planta) {
                            if (inteligencia < 20) {
                                if (((Planta) seres.get(i)).getGrauDefesa() == 0) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 19 && inteligencia < 40) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 2) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 39 && inteligencia < 60) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 3) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 59 && inteligencia < 80){
                                if (((Planta) seres.get(i)).getGrauDefesa() < 4){
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 79 && inteligencia < 95) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 5){
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 94 && inteligencia <=100) {
                                if (((Planta) seres.get(i)).getGrauDefesa() <= 5) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                        }
                    }
                }

                if (animalAtual.getAlimentacao() == AlimentacaoDieta.Omnivoro){

                    for (int i = 0; i < seres.size(); i++){
                        if (seres.get(i) instanceof Animal){
                            double capacidadeOutroAnimal = ((Animal) seres.get(i)).getPesoKg() * (2.5*((Animal) seres.get(i)).getInteligencia());

                            if (capacidade > capacidadeOutroAnimal){
                                removerSerVivo(i);
                                animalAtual.setFome(false);
                                come = true;
                                break;
                            } else {
                                come = false;
                            }
                        }
                        if (seres.get(i) instanceof Inseto){
                            if (((Inseto) seres.get(i)).isVenenoso()){
                                removerSerVivo(indexAnimal);
                                come = false;
                                break;
                            } else {
                                removerSerVivo(i);
                                animalAtual.setFome(false);
                                come = true;
                                break;
                            }
                        }
                        if (seres.get(i) instanceof Planta) {
                            if (inteligencia < 20) {
                                if (((Planta) seres.get(i)).getGrauDefesa() == 0) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 19 && inteligencia < 40) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 2) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 39 && inteligencia < 60) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 3) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 59 && inteligencia < 80){
                                if (((Planta) seres.get(i)).getGrauDefesa() < 4){
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 79 && inteligencia < 95) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 5){
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                            if (inteligencia > 94 && inteligencia <=100) {
                                if (((Planta) seres.get(i)).getGrauDefesa() <= 5) {
                                    removerSerVivo(i);
                                    animalAtual.setFome(false);
                                    come = true;
                                    break;
                                } else {
                                    come = false;
                                }
                            }
                        }
                    }

                }
            } else{
                //System.out.println("O animal está de barriga cheia.");
            }
        }
        if (come) {
            return true;
        } else {
            return false;
        }
    }

    public void insetoChateia(){
        ArrayList<String> barulhoInseto = new ArrayList<String>();
        barulhoInseto.add("Bzzzz bzzzz");
        barulhoInseto.add("Tic tic tic tic");
        barulhoInseto.add("Pssssss");

        Random barulho = new Random();
        int index = barulho.nextInt(barulhoInseto.size());
        System.out.println(barulhoInseto.get(index));
    }

    public void listarSeresVivos(){
        for (int i = 0; i < seres.size(); i++){
            this.seres.get(i).listarInformacoes();
        }
    }

    public void plantaFazAcao(){
        Random random = new Random();
        ArrayList<SerVivo> plantas = new ArrayList<SerVivo>();

        for (int i = 0; i < seres.size(); i++) {
            SerVivo serVivoAtual = this.seres.get(i);
            if (serVivoAtual instanceof Planta) {
                plantas.add(serVivoAtual);
            }
        }

        if (!plantas.isEmpty()) {
            int plantaRandom = random.nextInt(0, plantas.size());

            SerVivo serVivo = plantas.get(plantaRandom);
            Planta plantaAtual = (Planta) serVivo;
            int funcaoRandom;

            if (plantaAtual.getFamilia() == FamiliaPlanta.Come_Insetos) {
                funcaoRandom = random.nextInt(1, 4);
            } else {
                funcaoRandom = random.nextInt(1, 3);
            }

            if (funcaoRandom == 1) {
                System.out.println("Planta abanou");
                plantaAbanaComVento(plantaRandom);
            } else if (funcaoRandom == 2) {
                System.out.println("Planta bebeu");
                plantaBebe(plantaRandom);
            } else if (funcaoRandom == 3) {
                System.out.println("Planta comeu insetos");
                plantaComeInsetos(plantaRandom);
            }
        }
    }

    public void animalFazAcao(){
        Random random = new Random();
        ArrayList<SerVivo> animais = new ArrayList<SerVivo>();

        for (int i = 0; i < seres.size(); i++) {
            SerVivo serVivoAtual = this.seres.get(i);
            if (serVivoAtual instanceof Animal) {
                animais.add(serVivoAtual);
            }
        }

        if (!animais.isEmpty()) {
            int animalRandom = random.nextInt(0, animais.size());

            int funcaoRandom = random.nextInt(1, 5);

            if (funcaoRandom == 1) {
                System.out.println("Animal fez barulho");
                animalFazBarulho(animalRandom);
            } else if (funcaoRandom == 2) {
                System.out.println("Animal movimentou-se");
                animalMovimenta(animalRandom);
            } else if (funcaoRandom == 3) {
                System.out.println("Animal bebeu");
                animalBebe(animalRandom);
            } else if (funcaoRandom == 4) {
                System.out.println("Animal comeu");
                animalCome(animalRandom);
            }
        }
    }

    public void insetoFazAcao() {
        ArrayList<SerVivo> insetos = new ArrayList<SerVivo>();

        for (int i = 0; i < seres.size(); i++) {
            SerVivo serVivoAtual = this.seres.get(i);
            if (serVivoAtual instanceof Inseto) {
                insetos.add(serVivoAtual);
            }
        }
        System.out.println("Inseto chateou");
        insetoChateia();
    }

    public void catastrofeNatural() {
        Random random = new Random();
        int cenario = random.nextInt(1, 4);

        if (cenario == 1) {
            System.out.println("Seca");
            aguaLitros /= 2;
        }
        if (cenario == 2) {
            System.out.println("Chuvas");
            aguaLitros *= 2;
        }
        if (cenario == 3) {
            System.out.println("Erupcao Vulcanica");
            int animais = 0, plantas = 0;
            for (int i = 0; i < seres.size(); i++) {
                if (seres.get(i) instanceof Animal) {
                    animais++;
                }
                if (seres.get(i) instanceof Planta) {
                    plantas++;
                }
            }
            plantas /= 2;
            animais /= 2;
            int contador1 = 0, contador2 = 0;
            for (int i = 0; i < this.seres.size(); i++) {
                SerVivo serVivoAtual = this.seres.get(i);
                if (serVivoAtual instanceof Animal) {
                    contador1++;
                    if (contador1 > animais) {
                        this.seres.remove(serVivoAtual);
                    }
                }
                if (serVivoAtual instanceof Planta) {
                    contador2++;
                    if (contador2 > plantas) {
                        this.seres.remove(serVivoAtual);
                    }
                }
            }
        }
    }


    public void simulador(int numDiasSimulacao) {
        int contadorDias=0;
        int momentoDia = 0;
        SerVivo ultimoAnimalMorrer = null;

        do {
            System.out.println("\nUm novo dia começa na " + this.nome);
            System.out.println("\nSeres Vivos que se encontram vivos: ");
            listarSeresVivos();
            for (int i = 0; i < seres.size(); i++) {
                SerVivo serVivoAtual = this.seres.get(i);
                if (serVivoAtual instanceof Animal) {
                    Animal animalAtual = (Animal) serVivoAtual;
                    animalAtual.setFome(true);
                }
            }
            while (momentoDia < 3) {
                Random random = new Random();
                int acontecimento = random.nextInt(1, 5);
                System.out.println("\nAcontecimento: " + acontecimento);

                if (acontecimento == 1) {
                   plantaFazAcao();
                }

                if (acontecimento == 2) {
                    animalFazAcao();
                }

                if (acontecimento == 3) {
                   insetoFazAcao();

                }
                if (acontecimento == 4) {
                    catastrofeNatural();
                }
                momentoDia++;
            }

            int c = 0;
            while (c < seres.size()){
                for (int i = 0; i < this.seres.size(); i++) {
                    SerVivo serVivoAtual = this.seres.get(i);
                    if (serVivoAtual instanceof Animal) {
                        Animal animalAtual = (Animal) serVivoAtual;
                        if (animalAtual.isFome()) {
                            System.out.println("\n" + animalAtual.getNome() + " Tem fome");
                            if (animalCome(i)) {
                                System.out.println(animalAtual.getNome() + " Comeu");
                                animalAtual.setFome(false);
                            } else {
                                ultimoAnimalMorrer = animalAtual;
                                removerSerVivo(i);
                                System.out.println(animalAtual.getNome() + " Morreu");
                            }
                        }
                    }
                }
                c++;
            }

            int contador=0;
            System.out.println("\nAnimais que se mantiveram vivos:");
            for (int i = 0; i < seres.size(); i++) {
                    if (seres.get(i) instanceof Animal) {
                        contador++;
                        if (contador >= 1) {
                            seres.get(i).listarInformacoes();
                        }
                    }
            }
            if (contador == 0) {
                System.out.println("Já não há animais vivos");
                System.out.println("\nÚltimo animal a morrer: " );
                ultimoAnimalMorrer.listarInformacoes();

            }
            contadorDias++;
            momentoDia = 0;
        } while (contadorDias < numDiasSimulacao);
    }
}
