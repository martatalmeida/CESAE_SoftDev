package Exercicio01;

public class Triangulo extends FiguraGeometrica{

    private double altura;
    private double base;

    public Triangulo(String cor, double altura, double base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.base*3;
    }
}
