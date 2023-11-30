package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoQueijo;
import Pizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origem);
        this.tipoQueijo = tipoQueijo;
    }
}
