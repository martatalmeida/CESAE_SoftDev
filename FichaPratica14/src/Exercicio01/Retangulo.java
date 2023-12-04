package Exercicio01;

public class Retangulo extends FiguraGeometrica{

    private double largura;
    private double comprimento;

    public Retangulo(String cor, double largura, double comprimento) {
        super(cor);
        this.largura = largura;
        this.comprimento = comprimento;
    }


    @Override
    public double calcularArea() {
        return this.largura * this.comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return (this.largura*2) + (this.comprimento*2);
    }
}
