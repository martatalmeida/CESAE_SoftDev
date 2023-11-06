package FichaPratica05;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int num, contador;
        contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 5; col++) {
                System.out.println("Insira um número: ");
                matriz[i][col] = input.nextInt();
            }
        }

        System.out.println("Insira outro numero: ");
        num = input.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 5; col++) {
                if (matriz[i][col] == num) {
                    contador++;
                }
            }
        }
        System.out.println("O número " + num + " aparece " + contador + " vezes");
    }

}
