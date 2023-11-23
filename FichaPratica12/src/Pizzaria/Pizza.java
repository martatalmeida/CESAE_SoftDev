package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;

    private ArrayList<Ingrediente> ingredientes;

    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public void adicionarIngredientes(Ingrediente ingrediente){
        if(this.ingredientes.size() < 5) {
            this.ingredientes.add(ingrediente);
        } else {
            System.out.println("Não pode acrescentar mais ingredientes");
        }
    }


    public void editarQuantidade(Ingrediente ingrediente, double quantidade){

    }



    public void removerIngrediente(String codigo){
        this.ingredientes.remove(codigo);
    }

}
