package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double prod1, prod2, prod3, soma, valor;

        System.out.print("Preço do produto 1: ");
        prod1= input.nextDouble();

        System.out.print("Preço do produto 2: ");
        prod2= input.nextDouble();

        System.out.print("Preço do produto 3: ");
        prod3= input.nextDouble();

        soma= prod1 + prod2 + prod3;

        valor = soma * 0.9;

        System.out.print("Preço com desconto: " + valor);

    }

}
