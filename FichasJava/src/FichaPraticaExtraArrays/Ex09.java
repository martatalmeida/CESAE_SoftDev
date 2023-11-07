package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número no array[" + i + "]:");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int cresc = i; cresc < 10; cresc++) {
                if (array[i] > array[cresc]) {
                    aux = array[i];
                    array[i] = array[cresc];
                    array[cresc] = aux;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

    }
}
