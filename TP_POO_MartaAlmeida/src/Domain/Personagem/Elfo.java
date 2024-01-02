package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;

public class Elfo extends Heroi {

    public Elfo(String nome, int vidaMax, int forca, int nivel, int ouro) {
        super(nome, vidaMax, forca, nivel, ouro);
    }

    @Override
    public Heroi heroiInicial() {
        return new Elfo(this.getNome(),this.getVidaMax(), this.getForca(), this.getNivel(), this.getOuro());
    }
}
