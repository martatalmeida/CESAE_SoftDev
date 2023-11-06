package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
