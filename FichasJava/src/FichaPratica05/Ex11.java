package FichaPratica05;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior, menor;


        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira um número: ");
                matriz[i][col] = input.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

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
        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[i][col] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }

}
