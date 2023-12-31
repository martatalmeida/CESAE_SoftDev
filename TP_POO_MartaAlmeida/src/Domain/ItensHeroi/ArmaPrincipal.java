package Domain.ItensHeroi;

import Domain.ItensHeroi.ItemHeroi;

public class ArmaPrincipal extends ItemHeroi {

    private int ataque;
    private int ataqueEspecial;

    public ArmaPrincipal(String nome, int precoMoedasOuro, int ataque, int ataqueEspecial) {
        super(nome, precoMoedasOuro);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * Método para mostrar os detalhes da ArmaPrincipal
     */
    @Override
    public void mostrarDetalhes() {
        System.out.print("Tipo: Arma Principal | ");
        super.mostrarDetalhes();
        System.out.print("Ataque: " + this.ataque + " | Ataque Especial: " + this.ataqueEspecial);
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
}
