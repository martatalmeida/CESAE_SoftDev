package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Insira os numeros do array: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            for (int dup = i+1; dup < 12; dup++) {
                if (array[i] == array[dup]) {
                    System.out.println("O número " + array[i] + " está duplicado");
                    break;
                }
            }
        }

    }

}
