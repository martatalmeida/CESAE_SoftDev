package Exercicio03;

public class Animal {

    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void animalComer(String alimento, double peso) {
        int contador = 0;
        for (int i = 0; i < alimentacao.length; i++) {
            if (alimento.equals(this.alimentacao[i])) {
                this.peso += (peso / 1000);
                System.out.println("O animal comeu.");
                contador = 1;
            }
        }
        if (contador == 0) {
            System.out.println("O animal recusou essa comida.");
        }
    }

        public double getPeso () {
            return this.peso;
        }
    }

