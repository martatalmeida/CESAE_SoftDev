package Domain.ItensHeroi;

import java.util.ArrayList;

public abstract class ItemHeroi {

    private String nome;
    private int precoMoedasOuro;
    private ArrayList<String> heroisPermitidos;

    public ItemHeroi(String nome, int precoMoedasOuro) {
        this.nome = nome;
        this.precoMoedasOuro = precoMoedasOuro;
        this.heroisPermitidos = new ArrayList<>();
    }

    public void mostrarDetalhes(){
        System.out.println("*** Detalhes do Item ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.precoMoedasOuro + " moedas");
    }

    public void addHeroiPermitido(ArrayList<String> heroiPermitido){
        this.heroisPermitidos.add(String.valueOf(heroiPermitido));
    }

}
