package Pizzaria;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{

    private BasePizza tipoBase;

    public Base(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, BasePizza tipoBase) {
        super(codigo, nome, unidadeMedida.Gramas, nCaloriasUnidadeMedida);
        this.tipoBase = tipoBase;
    }

    

}
