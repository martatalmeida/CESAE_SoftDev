package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.FamiliaPlanta;

public class Planta extends SerVivo{

    private FamiliaPlanta familia;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, FamiliaPlanta familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public FamiliaPlanta getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    public void listarDetalhes(){
        System.out.println("Família: " + this.familia + "\nGrau de Defesa: " + this.grauDefesa);
    }
}
