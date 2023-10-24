package FichaPratica02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, notas5, notas10, notas20, notas50, notas100, notas200;

        System.out.println("Insira um valor: ");
        valor = input.nextInt();


        notas200 = valor / 200;
        notas100 = (valor = valor % 200) / 100;
        notas50 = (valor = valor % 100) / 50;
        notas20 = (valor = valor % 50) / 20;
        notas10 = (valor = valor % 20) / 10;
        notas5 = (valor = valor % 10) / 5;


        if (valor % 5 == 0) {
                System.out.println("Notas de 200: " + notas200);
                System.out.println("Notas de 100: " + notas100);
                System.out.println("Notas de 50: " + notas50);
                System.out.println("Notas de 20: " + notas20);
                System.out.println("Notas de 10: " + notas10);
                System.out.println("Notas de 5: " + notas5);
        } else {
            System.out.println("O valor não é múltiplo de 5");
        }


    }


}
