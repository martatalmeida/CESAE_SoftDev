package Exercicio02;

public class Personagem extends Entidade{

    private int nivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }


}
