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

    /**
     * Método para mostrar os detalhes do ItemHeroi
     */
    public void mostrarDetalhes(){
        System.out.print("Nome: " + this.nome + " | Preço em moedas: " + this.precoMoedasOuro + " | Heróis Permitidos: ");
        for (String heroiPermitidoAtual : this.heroisPermitidos){
            System.out.print(heroiPermitidoAtual + " | ");
        }
    }

    /**
     * Método para adicionar os herois permitidos de um certo item
     * @param heroisNovos ArrayList com os herois que são permitidos comprarem o item
     */
    public void addHeroisPermitido(ArrayList<String> heroisNovos){
        for (String heroiNovoAtual: heroisNovos){
            this.heroisPermitidos.add(heroiNovoAtual);
        }
    }


}
