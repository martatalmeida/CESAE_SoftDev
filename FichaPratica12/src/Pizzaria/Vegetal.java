package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoVegetal;
import Pizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{

    private TipoVegetal tipoVegetal;

    public Vegetal(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origem);
        this.tipoVegetal = tipoVegetal;
    }
}
