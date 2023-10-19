package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double prod1, prod2, prod3, soma, desconto, valor;

        System.out.print("Preço do produto: ");
        prod1= input.nextDouble();

        System.out.print("Preço do produto: ");
        prod2= input.nextDouble();

        System.out.print("Preço do produto: ");
        prod3= input.nextDouble();

        soma= prod1 + prod2 + prod3;

        desconto= soma * 0.1;

        valor = soma - desconto;

        System.out.print(valor);

    }

}
