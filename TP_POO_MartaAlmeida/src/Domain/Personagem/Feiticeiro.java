package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;

public class Feiticeiro extends Heroi {

    public Feiticeiro(String nome, int vidaMax, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, vidaMax, forca, nivel, ouro, armaPrincipal);
    }

    @Override
    public void atacar(NPC npc) {

    }
}
