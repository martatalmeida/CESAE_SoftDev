package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.FamiliaPlanta;

import java.util.ArrayList;

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
            return true;
        } else {
            return false;
        }
    }



}
