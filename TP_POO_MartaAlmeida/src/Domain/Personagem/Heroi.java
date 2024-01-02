package Domain.Personagem;

import Domain.ItensHeroi.ArmaPrincipal;
import Domain.ItensHeroi.Consumivel;
import Domain.ItensHeroi.ConsumivelCombate;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int forca, int nivel, int ouro) {
        super(nome, vidaMax, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = new ArmaPrincipal("Punhos", 0, 0, 1);
        this.inventario = new ArrayList<Consumivel>();
    }

    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    /**
     * Método para guardar o heroi inicial
     * @return heroi inicial
     */
    public abstract Heroi heroiInicial();

}
