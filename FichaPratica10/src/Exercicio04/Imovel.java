package Exercicio04;

public class Imovel {

    private String rua;
    private int numPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numCasasBanho;
    private double areaPiscina;

    public Imovel(String rua, int numPorta, String cidade, Tipo tipo, Acabamento acabamento, double area, int numQuartos, int numCasasBanho, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numCasasBanho = numCasasBanho;
        this.areaPiscina = areaPiscina;
    }

    public double valorImovel() {
        double valorTotal = 0;
        switch (this.tipo){
            case APARTAMENTO -> valorTotal += area*1000;
            case CASA -> valorTotal += area*3000;
            case MANSAO -> valorTotal += area*5000;
        }
        switch (this.acabamento) {
            case PARA_RESTAURO -> valorTotal -= (valorTotal*0.5);
            case USADA -> valorTotal -= (valorTotal*0.1);
            case NOVA -> valorTotal = valorTotal;
            case NOVA_COM_ALTO_ACABAMENTO -> valorTotal += (valorTotal*0.25);
        }
        valorTotal += numQuartos*7500;
        valorTotal += numCasasBanho*10500;
        valorTotal += areaPiscina*1000;

        return valorTotal;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimirDescricao(){
        System.out.println("Descrição do Imóvel: ");
        System.out.println("Rua: " + this.rua);
        System.out.println("Nº Porta: " + this.numPorta);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Area: " + this.area);
        System.out.println("Nº Quartos: " + this.numQuartos);
        System.out.println("Nº Casas de Banho: " + this.numCasasBanho);
        System.out.println("Área Piscina: " + this.areaPiscina);
    }

    public Imovel compararImoveis(Imovel imovel2){
        if (this.valorImovel() > imovel2.valorImovel()){
            return this;
        } else {
            return imovel2;
        }
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumPorta() {
        return this.numPorta;
    }

    public String getCidade() {
        return this.cidade;
    }
}
