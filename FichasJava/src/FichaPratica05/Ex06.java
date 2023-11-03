package FichaPratica05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        boolean crescente = true;
        int numAnterior;

        System.out.println("Insira um número: ");
        array[0] = input.nextInt();

        numAnterior = array[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = input.nextInt();
            if (array[i] < numAnterior) {
                crescente = false;
            }
            numAnterior = array[i];
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não Crescente");
        }

    }
}
