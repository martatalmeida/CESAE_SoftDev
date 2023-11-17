package Exercicio07;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Orgulho e Preconceito", "Jane Austen", "Classico", 300, 472942033);
        Livro livro2 = new Livro("Grande Gatsby", "Fitzgerald", "Classico", 250, 420471043);

        livro1.exibirDetalhes();
        System.out.println("\n");
        livro2.exibirDetalhes();

    }

}
