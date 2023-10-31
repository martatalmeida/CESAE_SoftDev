package FichaPratica05;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        int n = 0;
        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[n] = input.nextInt();
            if (array[n] > maior) {
                maior = array[n];
            }
            n++;
        }

        System.out.println("Maior: " + maior);

    }

}
