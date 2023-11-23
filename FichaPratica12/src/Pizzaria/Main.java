package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        Ingrediente ingrediente1 = new Ingrediente("1", "Queijo", UnidadeMedida.Gramas,5,100);
        Ingrediente ingrediente2 = new Ingrediente("2", "Fiambre", UnidadeMedida.Gramas,4,50);
        Ingrediente ingrediente3 = new Ingrediente("3", "Cogumelos",UnidadeMedida.Gramas,6,30);

        Pizza pizza1 = new Pizza(1, "Queijo e Fiambre","Queijo Mozzarella e Fiambre",8, TamanhoPizza.Média);

        pizza1.adicionarIngredientes(ingrediente1);
        pizza1.adicionarIngredientes(ingrediente2);

        pizza1.removerIngrediente("2");

    }

}
