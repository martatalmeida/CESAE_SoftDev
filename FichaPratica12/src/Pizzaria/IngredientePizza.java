package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class IngredientePizza {

    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void detalhesIngredientesPizza(){
        if (ingrediente.getUnidadeMedida() == UnidadeMedida.Gramas) {
            ingrediente.detalhesIngredientes();
            System.out.print(this.quantidade + " g\n");
        }
        if (ingrediente.getUnidadeMedida() == UnidadeMedida.Unidades) {
            ingrediente.detalhesIngredientes();
            System.out.print(this.quantidade + " uni.\n");
        }
        if (ingrediente.getUnidadeMedida() == UnidadeMedida.Litros) {
            ingrediente.detalhesIngredientes();
            System.out.print (this.quantidade + " L.\n");
        }
    }
}
