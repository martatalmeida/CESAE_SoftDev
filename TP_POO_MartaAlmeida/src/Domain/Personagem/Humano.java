package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;

public class Humano extends Heroi {

    public Humano(String nome, int vidaMax, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, vidaMax, forca, nivel, ouro, armaPrincipal);
    }
}
