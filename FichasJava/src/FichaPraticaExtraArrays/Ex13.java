package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior, menor;

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira os numeros da matriz: ");
                matriz[i][col] = input.nextInt();
            }
        }

        menor = matriz[0][0];
        maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                if (matriz[i][col] > maior) {
                    maior = matriz[i][col];
                }
                if (matriz[i][col] < menor) {
                    menor = matriz[i][col];
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }

}
