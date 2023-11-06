package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho;

        System.out.println("Diga o tamanho do array: ");
        tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira um numero no array [" + i + "]");
            array[i] = input.nextInt();
        }

    }
}
