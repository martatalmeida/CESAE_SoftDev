package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Insira um número: ");
                matriz[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[i][col] + "\t");
            }
            System.out.println();
        }

    }

}
