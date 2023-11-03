package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = input.nextInt();
            if (array[i] % 2 == 0) {
                if (array[i] > maior) {
                    maior = array[i];
                }
            }
        }

        if (maior != 0) {
            System.out.println("Maior Nº Par: " + maior);
        } else {
            System.out.println("Não foram inseridos números pares");
        }
    }

}
