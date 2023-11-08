package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex03 {

    public static double calcularAreaRetangulo(double base, double altura) {

        double area;

        area = base*altura;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Insira a base do retangulo: ");
        base = input.nextDouble();

        System.out.println("Insira a altura do retangulo: ");
        altura = input.nextDouble();

        area = calcularAreaRetangulo(base, altura);
        System.out.println("Área: " + area);

    }

}
