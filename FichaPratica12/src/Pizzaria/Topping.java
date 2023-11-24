package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.UnidadeMedida;

public class Topping extends Ingrediente{

    private OrigemIngrediente origem;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida);
        this.origem = origem;
    }
}
