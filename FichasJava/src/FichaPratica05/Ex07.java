package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maiorPar = -1;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = input.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                maiorPar = array[i];
                }
            }

        for (int i = 0; i < 10; i++) {
            if ((array[i] > maiorPar || maiorPar == -1) && array[i] % 2 == 0) {
                maiorPar = array[i];
            }
        }


        if (maiorPar % 2 == 0) {
            System.out.println("Maior Nº Par: " + maiorPar);
        } else {
            System.out.println("Não foram inseridos números pares");
        }
    }

}
