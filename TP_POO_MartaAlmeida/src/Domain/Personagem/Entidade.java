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

    public String getNome() {
        return nome;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getForca() {
        return forca;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public void setForca(int forca) {
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
