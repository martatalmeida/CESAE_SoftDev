package Exercicio01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    /**
     * Método contrutor de Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa
     * @param altura Altura da Pessoa
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
