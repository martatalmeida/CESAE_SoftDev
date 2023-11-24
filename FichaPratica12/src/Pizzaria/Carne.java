package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoCarne;
import Pizzaria.Enums.UnidadeMedida;

public class Carne extends Topping{

    private TipoCarne tipoCarne;

    public Carne(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origem);
        this.tipoCarne = tipoCarne;
    }
}
