package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira um número na matriz 1: ");
                matriz1[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira um número na matriz 2: ");
                matriz2[i][col] = input.nextInt();
            }
        }

        int[][] matriz3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                matriz3[i][col] = matriz1[i][col] + matriz2[i][col];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz3[i][col] + " ");
            }
            System.out.println();
        }
    }

}
