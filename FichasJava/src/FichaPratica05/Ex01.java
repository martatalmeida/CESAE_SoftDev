package FichaPratica05;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
            i++;
        }

        for (i=0; i<10; i++) {
            System.out.println(array[i]);
        }


    }
}
