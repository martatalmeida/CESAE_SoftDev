package Exercicio01;

public class Main {

    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor", 24, 1.7);
        Pessoa francisca = new Pessoa ("Francisca", 40, 1.6);

        System.out.println("Nome: " + vitor.getNome());
        System.out.println("Idade: " + vitor.getIdade());
        System.out.println("Altura: " + vitor.getAltura());

        System.out.println("\nNome: " + francisca.getNome());
        System.out.println("Idade: " + francisca.getIdade());
        System.out.println("Altura: " + francisca.getAltura());
    }

}
