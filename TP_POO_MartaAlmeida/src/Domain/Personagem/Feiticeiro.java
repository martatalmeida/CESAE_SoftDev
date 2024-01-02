package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;
import Domain.ItensHeroi.Consumivel;

import java.util.Scanner;

public class Feiticeiro extends Heroi {

    public Feiticeiro(String nome, int vidaMax, int forca, int nivel, int ouro) {
        super(nome, vidaMax, forca, nivel, ouro);
    }

    @Override
    public Heroi heroiInicial() {
        return new Feiticeiro(this.getNome(),this.getVidaMax(), this.getForca(), this.getNivel(), this.getOuro());
    }


}
