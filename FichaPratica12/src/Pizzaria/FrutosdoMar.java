package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoFrutosdoMar;
import Pizzaria.Enums.UnidadeMedida;

public class FrutosdoMar extends Topping{

    private TipoFrutosdoMar tipoFrutosdoMar;

    public FrutosdoMar(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origem, TipoFrutosdoMar tipoFrutosdoMar) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origem);
        this.tipoFrutosdoMar = tipoFrutosdoMar;
    }
}
