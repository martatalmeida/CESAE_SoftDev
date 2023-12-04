package Pizzaria;

import Pizzaria.Enums.*;

public class Main {

    public static void main(String[] args) {

        Base base = new Base("1","Massa Fina",5, BasePizza.Massa_Fina);
        Queijo ingrediente1 = new Queijo("2", "Queijo", UnidadeMedida.Gramas,4, OrigemIngrediente.Nacional, TipoQueijo.Mozzarela);
        Carne ingrediente2 = new Carne("3", "Fiambre", UnidadeMedida.Gramas,4, OrigemIngrediente.Importado,TipoCarne.Porco);
        Vegetal ingrediente3 = new Vegetal("4", "Cogumelos",UnidadeMedida.Gramas,6,OrigemIngrediente.Nacional,TipoVegetal.Cogumelos);
        Carne ingrediente4 = new Carne("5","Presunto",UnidadeMedida.Unidades, 15, OrigemIngrediente.Importado,TipoCarne.Porco);
        FrutosdoMar ingrediente5 = new FrutosdoMar("6", "Camarão", UnidadeMedida.Unidades, 10, OrigemIngrediente.Nacional,TipoFrutosdoMar.Camarao);
        Vegetal ingrediente6 = new Vegetal("7","Tomate",UnidadeMedida.Gramas,5,OrigemIngrediente.Nacional,TipoVegetal.Tomate);
        Vegetal ingrediente7 = new Vegetal("8", "Pimento", UnidadeMedida.Gramas, 3, OrigemIngrediente.Importado, TipoVegetal.Pimento);


        IngredientePizza massa = new IngredientePizza(base, 200);
        IngredientePizza queijo = new IngredientePizza(ingrediente1,100);
        IngredientePizza fiambre = new IngredientePizza(ingrediente2,50);
        IngredientePizza cogumelos = new IngredientePizza(ingrediente3,30);
        IngredientePizza presunto = new IngredientePizza(ingrediente4, 10);
        IngredientePizza camarões = new IngredientePizza(ingrediente5,10);
        IngredientePizza tomate = new IngredientePizza(ingrediente6, 100);
        IngredientePizza pimento = new IngredientePizza(ingrediente7, 30);


        Pizza pizza1 = new Pizza(1, "Queijo e Fiambre","Queijo Mozzarella e Fiambre",8, TamanhoPizza.Média);
        Pizza pizza2 = new Pizza(2, "Capriciosa", "Pizza variada",12,TamanhoPizza.Média);
        Pizza pizza3 = new Pizza(3, "Vegetariana", "Pizza com cogumelos, tomate e pimento", 12, TamanhoPizza.Média);

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
        System.out.println("");
        pizza1.definirTipoPizza();

        pizza2.adicionarIngredientes(massa);
        pizza2.adicionarIngredientes(tomate);
        pizza2.adicionarIngredientes(queijo);
        pizza2.adicionarIngredientes(presunto);
        pizza2.adicionarIngredientes(camarões);

        System.out.println("");
        pizza2.detalhesPizza();
        System.out.println("");
        pizza2.definirTipoPizza();

        pizza3.adicionarIngredientes(massa);
        pizza3.adicionarIngredientes(tomate);
        pizza3.adicionarIngredientes(cogumelos);
        pizza3.adicionarIngredientes(pimento);

        System.out.println("");
        pizza3.detalhesPizza();
        System.out.println("");
        pizza3.definirTipoPizza();

    }

}
