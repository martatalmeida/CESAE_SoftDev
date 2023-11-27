package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.AlimentacaoDieta;

public class Animal extends SerVivo{

    private boolean fome;
    private double pesoKg;
    private double inteligencia;
    private AlimentacaoDieta alimentacao;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double pesoKg, double inteligencia, AlimentacaoDieta alimentacao, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.pesoKg = pesoKg;
        this.inteligencia = inteligencia;
        this.alimentacao = alimentacao;
        this.barulho = barulho;
    }
}
