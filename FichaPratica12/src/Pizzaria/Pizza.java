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

    public void adicionarIngredientes(IngredientePizza ingrediente){
        if(this.ingredientes.size() < 5) {
            this.ingredientes.add(ingrediente);
        } else {
            System.out.println("Não pode acrescentar mais ingredientes");
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

    public void detalhesPizza()
    {
        System.out.println("***** Pizza " + this.nome + " *****");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);
        for (int i=0; i < ingredientes.size(); i++){
            System.out.print("Ingrediente " + (i+1) + ": ");
            ingredientes.get(i).detalhesIngredientesPizza();
        }


    }
}
