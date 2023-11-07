package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[3][2];
        int soma = 0;
        int contador = 0;


        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 2; col++) {
                System.out.println("Insira os numeros da matriz 1: ");
                matriz1[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 2; col++) {
                soma += matriz1[i][col];
                contador++;
            }
        }

        System.out.println("Média: " + soma/contador);
    }

}
