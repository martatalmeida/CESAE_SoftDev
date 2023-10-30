package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, negativo, positivo;

        negativo = 0;
        positivo = 0;

        do {
            System.out.println("Insira um número: ");
            num = input.nextInt();


            if (num < 0) {
                negativo++;
            }
            if (num > 0) {
                positivo++;
            }

        } while (num != 0);

        System.out.println("Negativos: " + negativo);
        System.out.println("Positivos: " + positivo);
    }

}
