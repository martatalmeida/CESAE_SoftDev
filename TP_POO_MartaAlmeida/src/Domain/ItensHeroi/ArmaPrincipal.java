package Domain.ItensHeroi;

import Domain.ItensHeroi.ItemHeroi;

public class ArmaPrincipal extends ItemHeroi {

    private int Ataque;
    private int AtaqueEspecial;

    public ArmaPrincipal(String nome, int precoMoedasOuro, int ataque, int ataqueEspecial) {
        super(nome, precoMoedasOuro);
        Ataque = ataque;
        AtaqueEspecial = ataqueEspecial;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ataque: " + this.Ataque);
        System.out.println("Ataque Especial: " + this.AtaqueEspecial);
    }
}
