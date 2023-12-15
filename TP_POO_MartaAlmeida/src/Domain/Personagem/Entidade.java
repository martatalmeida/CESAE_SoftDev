package Domain.Personagem;

public abstract class Entidade {

    private String nome;
    private int vidaMax;
    private int vidaAtual;
    private int forca;

    public Entidade(String nome, int vidaMax, int forca) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaMax;
        this.forca = forca;
    }

    public void mostrarDetalhes(){
        System.out.println("*** Detalhes da Personagem ***");
        System.out.println("Nome: " +this.nome);
        System.out.println("Vida Máxima: " + this.vidaMax);
        System.out.println("Vida Atual: " + this.vidaAtual);
        System.out.println("Força: " + this.forca);
    }

}
