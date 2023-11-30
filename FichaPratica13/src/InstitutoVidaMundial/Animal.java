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

    public String getBarulho() {
        return barulho;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public AlimentacaoDieta getAlimentacao() {
        return alimentacao;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    @Override
    public void listarInformacoes() {
        super.listarInformacoes();
        System.out.println("Fome: " + this.fome + "\nPeso: " + this.pesoKg + "\nInteligência: " + this.inteligencia + "\nAlimentação: " + this.alimentacao + "\nBarulho: " + this.barulho);
    }


}
