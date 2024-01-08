package Ex04;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return (this.altura*2) + (this.largura*2);
    }

}
