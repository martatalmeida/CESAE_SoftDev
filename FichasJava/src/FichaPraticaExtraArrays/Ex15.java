package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linhas, colunas;

        System.out.println("Nº de linhas: ");
        linhas = input.nextInt();

        System.out.println("Nº de colunas: ");
        colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int col = 0; col < colunas; col++) {
                System.out.println("Insira os números da matriz: ");
                matriz[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < colunas; i++) {
            for (int col = 0; col < linhas; col++) {
                System.out.print(matriz[col][i] + " ");
            }
            System.out.println();
        }

        }


    }


