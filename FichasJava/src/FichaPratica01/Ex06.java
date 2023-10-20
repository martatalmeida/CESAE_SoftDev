package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int valor1, valor2;

        System.out.print("Escreva um valor: ");
        valor1= input.nextInt();

        System.out.print("Escreva um valor: ");
        valor2= input.nextInt();

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);







    }

}
