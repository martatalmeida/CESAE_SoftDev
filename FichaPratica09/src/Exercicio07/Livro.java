package Exercicio07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private int isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.categoria);
        System.out.println(this.numPaginas);
        System.out.println(this.isbn);
    }

}
