package Exercicio04;

public class Retangulo extends FormaGeometrica{

    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        double area = this.largura * this.comprimento;
        return area;
    }

}
