package Domain.ItensHeroi;

import Domain.ItensHeroi.Consumivel;

public class ConsumivelCombate extends Consumivel {

    private int AtaqueInstantaneo;

    public ConsumivelCombate(String nome, int precoMoedasOuro, int ataqueInstantaneo) {
        super(nome, precoMoedasOuro);
        AtaqueInstantaneo = ataqueInstantaneo;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ataque Instantaneo: " + this.AtaqueInstantaneo);
    }
}
