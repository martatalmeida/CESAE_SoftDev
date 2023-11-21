package Exercicio03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        peixesPescados = new ArrayList<Peixe>();
        mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe(Peixe peixe){
            peixesPescados.add(peixe);
    }

    public void pescarMarisco(Marisco marisco) {
        mariscoPescado.add(marisco);
    }


    public void verificarCarga(double peso){
        if(capacidadeCarga < peso){
            System.out.println("O barco não aguenta a carga.");
        } else {
            System.out.println("O barco aguenta com a carga. Adicionou " + peso + "kg.");
        }
    }

    public void largarPeixe(int index){
        peixesPescados.remove(index);
    }

    public void largarMarisco(int index){
        mariscoPescado.remove(index);
    }

    public double calcularTotal(){
        double valor=0;
        double peso=0;
        double total=0;
        for (int i = 0; i < peixesPescados.size(); i++){
            valor = peixesPescados.get(i).getPrecoKg();
            peso = peixesPescados.get(i).getPeso();
            total += valor*peso;
        }
        for (int i = 0; i < mariscoPescado.size(); i++){
            valor = mariscoPescado.get(i).getPrecoKg();
            peso = mariscoPescado.get(i).getPeso();
            total += valor*peso;
        }
        return total;
    }

    public double salarioTripulacao(){
        double valorTripulante = calcularTotal() - (calcularTotal()*0.4);
        valorTripulante /= this.tripulacao;
        return valorTripulante;
    }



}
