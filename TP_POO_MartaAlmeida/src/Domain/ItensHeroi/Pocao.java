package Domain.ItensHeroi;

import Domain.ItensHeroi.Consumivel;

public class Pocao extends Consumivel {

    private int vidaACurar;
    private int aumentoForça;

    public Pocao(String nome, int precoMoedasOuro, int vidaACurar, int aumentoForça) {
        super(nome, precoMoedasOuro);
        this.vidaACurar = vidaACurar;
        this.aumentoForça = aumentoForça;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Vida a Curar: " + this.vidaACurar);
        System.out.println("Aumento de Força: " + this.aumentoForça);
    }
}
