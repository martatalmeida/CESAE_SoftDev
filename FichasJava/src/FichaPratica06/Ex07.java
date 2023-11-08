package FichaPratica06;

import java.util.Scanner;

public class Ex07 {

    public static void desenharQuadrado(String carater, int linhas, int colunas) {

        int[][] quadrado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int col = 0; col < colunas; col++) {
                if ( i == 0 || col == 0 || i == linhas-1 || col == colunas-1) {
                    System.out.print(carater);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String caracter;
        int numLinhas, numColunas;

        System.out.println("Introduza um caracter: ");
        caracter = input.next();

        System.out.println("Introduza número de linhas: ");
        numLinhas = input.nextInt();

        System.out.println("Introduza número de colunas: ");
        numColunas = input.nextInt();

        desenharQuadrado(caracter, numLinhas, numColunas);

    }

}
