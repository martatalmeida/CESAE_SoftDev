package Domain.ItensHeroi;

import Domain.ItensHeroi.Consumivel;

public class ConsumivelCombate extends Consumivel {

    private int AtaqueInstantaneo;

    public ConsumivelCombate(String nome, int precoMoedasOuro, int ataqueInstantaneo) {
        super(nome, precoMoedasOuro);
        AtaqueInstantaneo = ataqueInstantaneo;
    }

    public int getAtaqueInstantaneo() {
        return AtaqueInstantaneo;
    }

    /**
     * Método para mostrar os detalhes do ConsumívelCombate
     */
    @Override
    public void mostrarDetalhes() {
        System.out.print("Tipo: Consumível Combate | ");
        super.mostrarDetalhes();
        System.out.print("Ataque Instantaneo: " + this.AtaqueInstantaneo);
    }
}
