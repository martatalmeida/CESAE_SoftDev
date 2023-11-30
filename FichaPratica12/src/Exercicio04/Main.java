package Exercicio04;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10,20);
        Triangulo triangulo = new Triangulo(10, 10);
        Circulo circulo = new Circulo(10);

        double areaRetangulo = retangulo.calcularArea();
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTriangulo = triangulo.calcularArea();
        System.out.println("Área do Traingulo: " + areaTriangulo);

        double areaCirculo = circulo.calcularArea();
        System.out.println("Área do Circulo: " + areaCirculo);

    }
}
