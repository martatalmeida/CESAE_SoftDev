package FichaPratica05;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Insira um número: ");
        array[0] = input.nextInt();

        int maior = array[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = input.nextInt();
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        System.out.println("Maior: " + maior);

    }

}
