package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class IngredientePizza extends Ingrediente{
    private double quantidade;

    public IngredientePizza(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, double quantidade) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida);
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void detalhesIngredientesPizza(){
        if (getUnidadeMedida() == UnidadeMedida.Gramas) {
            detalhesIngredientes();
            System.out.print(this.quantidade + " g\n");
        }
        if (getUnidadeMedida() == UnidadeMedida.Unidades) {
            detalhesIngredientes();
            System.out.print(this.quantidade + " uni.\n");
        }
        if (getUnidadeMedida() == UnidadeMedida.Litros) {
            detalhesIngredientes();
            System.out.print (this.quantidade + " L.\n");
        }
    }
}
