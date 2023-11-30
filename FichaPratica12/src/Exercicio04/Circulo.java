package Exercicio04;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = 3.14 * (this.raio*this.raio);
        return area;
    }
}
