package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        IngredientePizza ingrediente1 = new IngredientePizza("1", "Queijo", UnidadeMedida.Gramas,5,100);
        IngredientePizza ingrediente2 = new IngredientePizza("2", "Fiambre", UnidadeMedida.Gramas,4,50);
        IngredientePizza ingrediente3 = new IngredientePizza("3", "Cogumelos",UnidadeMedida.Gramas,6,30);

        Pizza pizza1 = new Pizza(1, "Queijo e Fiambre","Queijo Mozzarella e Fiambre",8, TamanhoPizza.Média);

        pizza1.adicionarIngredientes(ingrediente1);
        pizza1.adicionarIngredientes(ingrediente2);
        pizza1.adicionarIngredientes(ingrediente3);

        pizza1.removerIngrediente("3");

        pizza1.editarQuantidade(ingrediente1,80);

        double caloriasPizza = pizza1.numCaloriasPizza();
        System.out.println("Número de calorias da Pizza: " + caloriasPizza);

        System.out.println("");
        pizza1.detalhesPizza();

    }

}
