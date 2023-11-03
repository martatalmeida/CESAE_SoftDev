package FichaPratica05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        double soma = 0;

        for (int i = 0; i<10; i++) {
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
            soma +=array[i];
        }

        int tamanho = array.length;

        System.out.println("Média: " + soma/tamanho);

    }

}
