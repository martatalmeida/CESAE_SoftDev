package FichaPratica05;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um numero: ");
            array1[i] = input.nextInt();
            matriz[i][0] = array1[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um numero: ");
            array2[i] = input.nextInt();
            matriz[i][1] = array2[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(matriz[i][col] + " ");
            }
            System.out.println(" ");
        }
    }

}
