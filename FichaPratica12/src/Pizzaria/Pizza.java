package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;

    private ArrayList<IngredientePizza> ingredientes;


    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    public void adicionarIngredientes(IngredientePizza ingrediente) {
        if (ingrediente.getIngrediente() instanceof Base) {
            if (this.ingredientes.size() < 1) {
                this.ingredientes.add(ingrediente);
            } else {
                System.out.println("Não pode acrescentar mais bases");
            }
        }

            if (ingrediente.getIngrediente() instanceof Topping) {
                    if (this.ingredientes.size() > 0) {
                        if (this.ingredientes.size() < 5) {
                            this.ingredientes.add(ingrediente);
                        } else {
                            System.out.println("Não pode acrescentar mais toppings");
                        }
                    } else {
                        System.out.println("Tem de acrescentar uma base primeiro.");
                    }
                }
            }



    public void editarQuantidade(IngredientePizza ingrediente, double quantidade){
        ingrediente.setQuantidade(quantidade);
    }

    public void removerIngrediente(String codigo){
        for (int i = 0; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getIngrediente().getCodigo().equals(codigo)){
                ingredientes.remove(i);
                return;
            }
        }
    }

    public double numCaloriasPizza(){
        double quantidade;
        double calorias;
        double totalCalorias=0;
        for (int i = 0; i < ingredientes.size(); i++){
            calorias = ingredientes.get(i).getIngrediente().getnCaloriasUnidadeMedida();
            quantidade = ingredientes.get(i).getQuantidade();
            totalCalorias += calorias * quantidade;
        }
        return totalCalorias;
    }

    public void detalhesPizza() {
        int contador = 1;
        System.out.println("***** Pizza " + this.nome + " *****");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);
        for (IngredientePizza ingredientePizzaAtual: this.ingredientes){
            System.out.print("Ingrediente " + contador + ": ");
            ingredientePizzaAtual.detalhesIngredientesPizza();
            contador++;
        }
    }


    public void definirTipoPizza(){
        int contador = 0;
        boolean carne = true;
        for (int i = 1; i < ingredientes.size(); i++){
            if (ingredientes.get(i).getIngrediente() instanceof Carne) {
                carne = true;
            } else {
                carne = false;
                break;
            }
        }
        if (carne) {
            System.out.println("Tipo: Pizza de Carne");
        }
        boolean mar = true;
        for (int i = 1; i < ingredientes.size(); i++){
            if (ingredientes.get(i).getIngrediente() instanceof FrutosdoMar) {
                mar = true;
            } else{
                mar = false;
                break;
            }
        }
        if (mar) {
            System.out.println("Tipo: Pizza do Mar");
        }
        boolean vegetariana = true;
        for (int i = 1; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getIngrediente() instanceof Vegetal){
                vegetariana = true;
            } else{
                vegetariana = false;
                break;
            }
        }
        if (vegetariana){
            System.out.println("Tipo: Pizza Vegetariana");
        }
        for (int i = 0; i < ingredientes.size(); i++){
            if (ingredientes.get(i).getIngrediente() instanceof Carne){
                contador++;
            }
            if (ingredientes.get(i).getIngrediente() instanceof FrutosdoMar){
                contador++;
            }
            if (ingredientes.get(i).getIngrediente() instanceof Queijo){
                contador++;
            }
            if (ingredientes.get(i).getIngrediente() instanceof Vegetal){
                contador++;
            }
        }
        if(contador >= 4){
            System.out.println("Tipo: Pizza Completa");
        }
        if (!carne && !mar && !vegetariana && contador < 4){
            System.out.println("Tipo: Pizza Mista");
        }
    }

}
