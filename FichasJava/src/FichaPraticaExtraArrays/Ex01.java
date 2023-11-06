package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[14];

        for (int i = 0; i < 14; i++) {
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 14; i++) {
            System.out.println(array[i]);
        }

    }

}
