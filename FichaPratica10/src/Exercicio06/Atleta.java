package Exercicio06;

public class Atleta {

    private String nome;
    private String modalidadeDesp;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidadeDesp, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidadeDesp = modalidadeDesp;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    public void detalhesAtletas(){
        System.out.println("Nome: " + this.nome + " | Modalidade Desportiva: " + this.modalidadeDesp + " | Altura: " + this.altura + " | Peso: " + this.peso + " | País de Origem: " + this.paisOrigem);
    }
}
