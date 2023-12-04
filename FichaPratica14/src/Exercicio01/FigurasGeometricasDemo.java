package Exercicio01;

public class FigurasGeometricasDemo {

    public static void main(String[] args) {

        Retangulo retangulo =new Retangulo("Preto", 200, 10);
        Circulo circulo = new Circulo("Verde", 10);
        Triangulo triangulo = new Triangulo("Azul", 10, 5);

        retangulo.mostrarCor();
        circulo.mostrarCor();
        triangulo.mostrarCor();

        System.out.println("Área do Retangulo: " + retangulo.calcularArea());
        System.out.println("Área do Circulo: " + circulo.calcularArea());
        System.out.println("Área do Triangulo: " + triangulo.calcularArea());

    }

}
