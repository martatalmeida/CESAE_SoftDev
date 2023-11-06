package FichaPraticaExtraArrays;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho, valor, posiçao;

        System.out.println("Diga o tamanho do array: ");
        tamanho = input.nextInt();

        int[] array1 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira um numero no array [" + i + "]");
            array1[i] = input.nextInt();
        }

        System.out.println("Insira um novo valor: ");
        valor = input.nextInt();

        System.out.println("Posição do novo valor: ");
        posiçao = input.nextInt();

        int[] array2 = new int[tamanho + 1];
        int newIndex = 0;


        for (int antes = 0; antes < posiçao; antes++) {
            array2[newIndex] = array1[antes];
            newIndex++;
        }

        array2[newIndex + 1] = valor;
        newIndex = posiçao + 1;

        for (int depois = posiçao + 1; depois < array1.length; depois++) {
            array2[newIndex] = array1[depois];
            newIndex++;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
