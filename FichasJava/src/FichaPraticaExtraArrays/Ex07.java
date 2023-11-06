package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho, remover, contador;
        contador = 0;

        System.out.println("Diga o tamanho do array: ");
        tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira um numero no array [" + i + "]");
            array[i] = input.nextInt();
        }

        System.out.println("Diga o valor a remover: ");
        remover = input.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (array[i] == remover) {
                contador++;
            }
        }

        int[] array2 = new int[tamanho-contador];
        int newIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != remover) {
                    array2[newIndex] = array[i];
                    newIndex++;
                }
            }

            for (int i = 0; i < array2.length; i++) {
                System.out.println(array2[i]);
            }
    }





}
