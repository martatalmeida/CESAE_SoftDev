package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int num;
        boolean existir = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = input.nextInt();
        }

        System.out.println("Pesquise um valor: ");
        num = input.nextInt();

        for (int i = 0; i < 10; i++) {
            if (num == array[i]) {
                existir = true;
            }
        }

        if (existir) {
            System.out.println(num + " existe no array");
            for (int i = 0; i < 10; i++) {
                if (num == array[i]) {
                    System.out.println("Array [" + i + "]");
                }
            }
        } else {
            System.out.println(num + " não existe no array");
        }


    }

}
