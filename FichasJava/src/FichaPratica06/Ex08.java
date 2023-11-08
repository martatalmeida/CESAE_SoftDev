package FichaPratica06;

import java.util.Scanner;

public class Ex08 {

    public static void somaMatrizes(int matriz1[][], int matriz2[][]) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int col = 0; col < matriz1[0].length; col++) {
                System.out.print((matriz1[i][col] + matriz2[i][col]) + " ");
            }
            System.out.println();
        }
    }

    public static int somaElementos (int matriz1[][], int matriz2[][]) {

        int soma = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int col = 0; col < matriz1[0].length; col++) {
                soma += matriz1[i][col] + matriz2[i][col];
            }
        }
        return soma;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira os numeros na matriz 1: ");
                matriz1[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira os numeros na matriz 2: ");
                matriz2[i][col] = input.nextInt();
            }
        }

        somaMatrizes(matriz1, matriz2);
        somatorio = somaElementos(matriz1, matriz2);
        System.out.println("Somatorio: " + somatorio);

    }
}
