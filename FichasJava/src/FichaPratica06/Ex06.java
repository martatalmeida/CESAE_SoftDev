package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho, opçao;

        System.out.println("Tamanho do array: ");
        tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira os números no array: ");
            array[i] = input.nextInt();
        }

        do {
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("Escolha uma opção: ");
            opçao = input.nextInt();

            switch (opçao) {
                case 1:
                    System.out.println("Maior Elemento: " + maior(array));
                    break;
                case 2:
                    System.out.println("Menor Elemento: " + menor(array));
                    break;
                case 3:
                    if (crescente(array)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não crescente");
                    }
                    break;
            }


        } while (opçao != 4);

    }

}
