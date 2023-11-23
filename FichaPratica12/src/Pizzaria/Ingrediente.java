package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {

    private String codigo;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private int nCaloriasUnidadeMedida;
    private double quantidade;

    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, int nCaloriasUnidadeMedida, double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.nCaloriasUnidadeMedida = nCaloriasUnidadeMedida;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
