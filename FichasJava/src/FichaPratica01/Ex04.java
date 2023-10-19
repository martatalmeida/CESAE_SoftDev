package FichaPratica01;

import java.util.Scanner;
public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area, pi=3.14;


        System.out.print("Insira a dimensão do raio: ");
        raio = input.nextDouble();

        area=pi * (raio*raio);

        System.out.print("Área: " + area);

    }

}
