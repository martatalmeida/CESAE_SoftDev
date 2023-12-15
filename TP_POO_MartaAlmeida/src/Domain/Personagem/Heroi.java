package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;
import Domain.ItensHeroi.Consumivel;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, vidaMax, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<Consumivel>();
    }
}
