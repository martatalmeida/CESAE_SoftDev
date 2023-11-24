package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {

    private String codigo;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double nCaloriasUnidadeMedida;


    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.nCaloriasUnidadeMedida = nCaloriasUnidadeMedida;
    }

    public String getCodigo() {
        return codigo;
    }
    public double getnCaloriasUnidadeMedida() {
        return nCaloriasUnidadeMedida;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void detalhesIngredientes(){
        System.out.print("[ " + this.codigo + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.nCaloriasUnidadeMedida + "Kcal ] : ");

    }


}
