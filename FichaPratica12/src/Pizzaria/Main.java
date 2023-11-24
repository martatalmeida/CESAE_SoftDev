package Pizzaria;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        Base base = new Base("1","Massa Fina",UnidadeMedida.Gramas,5, BasePizza.Massa_Fina);
        Topping ingrediente1 = new Topping("2", "Queijo", UnidadeMedida.Gramas,4, OrigemIngrediente.Nacional);
        Topping ingrediente2 = new Topping("2", "Fiambre", UnidadeMedida.Gramas,4, OrigemIngrediente.Importado);
        Topping ingrediente3 = new Topping("3", "Cogumelos",UnidadeMedida.Gramas,6,OrigemIngrediente.Nacional);

        IngredientePizza massa = new IngredientePizza(base, 200);
        IngredientePizza queijo = new IngredientePizza(ingrediente1,100);
        IngredientePizza fiambre = new IngredientePizza(ingrediente2,50);
        IngredientePizza cogumelos = new IngredientePizza(ingrediente3,30);


        Pizza pizza1 = new Pizza(1, "Queijo e Fiambre","Queijo Mozzarella e Fiambre",8, TamanhoPizza.Média);

        pizza1.adicionarIngredientes(massa);
        pizza1.adicionarIngredientes(queijo);
        pizza1.adicionarIngredientes(fiambre);
        pizza1.adicionarIngredientes(cogumelos);

        pizza1.removerIngrediente("3");

        pizza1.editarQuantidade(queijo,80);

        double caloriasPizza = pizza1.numCaloriasPizza();
        System.out.println("Número de calorias da Pizza: " + caloriasPizza);

        System.out.println("");
        pizza1.detalhesPizza();

    }

}
