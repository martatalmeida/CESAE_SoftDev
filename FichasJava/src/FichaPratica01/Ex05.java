package FichaPratica01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, mediaPonderada;

        System.out.print("Escreva um número: ");
        num1 = input.nextDouble();

        System.out.print("Escreva um número: ");
        num2 = input.nextDouble();

        System.out.print("Escreva um número: ");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;
        mediaPonderada = (num1*0.2)+(num2*0.3)+(num3*0.5);

        System.out.println("Média aritmética: " + media);
        System.out.println("Média ponderada: " + mediaPonderada);

    }

}
