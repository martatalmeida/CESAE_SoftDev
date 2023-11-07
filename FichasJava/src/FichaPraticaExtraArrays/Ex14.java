package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior, menor, menor2, maior2;

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

        if (matriz[0][0] != menor) {
            menor2 = matriz[0][0];
        } else {
            menor2 = matriz[0][1];
        }

        if (matriz[0][0] != maior) {
            maior2 = matriz[0][0];
        } else {
            maior2 = matriz[0][1];
        }


        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                if (matriz[i][col] < maior && matriz[i][col] > maior2) {
                    maior2 = matriz[i][col];
                }
                if (matriz[i][col] > menor && matriz[i][col] < menor2) {
                    menor2 = matriz[i][col];
                }
            }
        }
        System.out.println("Segundo menor: " + menor2);
        System.out.println("Segundo maior: " + maior2);
    }

}
