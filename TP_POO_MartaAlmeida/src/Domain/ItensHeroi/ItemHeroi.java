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

    public String getNome() {
        return nome;
    }

    public int getPrecoMoedasOuro() {
        return precoMoedasOuro;
    }

    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }

    public void mostrarDetalhes(){
        System.out.print("Nome: " + this.nome + " | Preço em moedas: " + this.precoMoedasOuro + " | Heróis Permitidos: ");
        for (String heroiPermitidoAtual : this.heroisPermitidos){
            System.out.print(heroiPermitidoAtual + " | ");
        }
    }

    public void addHeroisPermitido(ArrayList<String> heroisNovos){
        for (String heroiNovoAtual: heroisNovos){
            this.heroisPermitidos.add(heroiNovoAtual);
        }
    }

    public void addHeroiPermitido(String heroiNovo){
        this.heroisPermitidos.add(heroiNovo);
    }

}
