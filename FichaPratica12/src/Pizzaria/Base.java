package Pizzaria;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{

    private BasePizza tipoBase;

    public Base(String codigo, String nome, double nCaloriasUnidadeMedida, BasePizza tipoBase) {
        super(codigo, nome, UnidadeMedida.Gramas, nCaloriasUnidadeMedida);
        this.tipoBase = tipoBase;
    }

    

}
