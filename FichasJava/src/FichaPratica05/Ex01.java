package FichaPratica05;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int [10];
        int i = 0;
        int n = 0;

        while (i < 10) {
            System.out.println("Insira um numero: ");
            array[n] = input.nextInt();
            i++;
            n++;
        }


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);

    }

}
