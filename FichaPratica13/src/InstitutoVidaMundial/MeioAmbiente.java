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
        boolean come = false;

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
                                come = true;
                                removerSerVivo(i);
                                break;
                            }
                        }
                        if (seres.get(i) instanceof Inseto){
                            if (((Inseto) seres.get(i)).isVenenoso()){
                                removerSerVivo(indexAnimal);
                            } else {
                                come = true;
                                removerSerVivo(i);
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
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 19 && inteligencia < 40) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 2) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 39 && inteligencia < 60) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 3) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 59 && inteligencia < 80){
                                if (((Planta) seres.get(i)).getGrauDefesa() < 4){
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 79 && inteligencia < 95) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 5){
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 94 && inteligencia <=100) {
                                if (((Planta) seres.get(i)).getGrauDefesa() <= 5) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
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
                                come = true;
                                removerSerVivo(i);
                                break;
                            }
                        }
                        if (seres.get(i) instanceof Inseto){
                            if (((Inseto) seres.get(i)).isVenenoso()){
                                removerSerVivo(indexAnimal);
                            } else {
                                come = true;
                                removerSerVivo(i);
                                break;
                            }
                        }
                        if (seres.get(i) instanceof Planta) {
                            if (inteligencia < 20) {
                                if (((Planta) seres.get(i)).getGrauDefesa() == 0) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 19 && inteligencia < 40) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 2) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 39 && inteligencia < 60) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 3) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 59 && inteligencia < 80){
                                if (((Planta) seres.get(i)).getGrauDefesa() < 4){
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 79 && inteligencia < 95) {
                                if (((Planta) seres.get(i)).getGrauDefesa() < 5){
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                            if (inteligencia > 94 && inteligencia <=100) {
                                if (((Planta) seres.get(i)).getGrauDefesa() <= 5) {
                                    come = true;
                                    removerSerVivo(i);
                                    break;
                                }
                            }
                        }
                    }
                }

                if (come) {
                    animalAtual.setFome(false);
                }
            } else{
                System.out.println("O animal está de barriga cheia.");
            }

        }
        if (come) {
            System.out.println("O animal comeu");
            return true;
        } else{
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

}
