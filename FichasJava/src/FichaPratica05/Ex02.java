package FichaPratica05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[12];
        double total = 0;


        for (int i=0; i<12; i++) {
            System.out.println("Insira uma comissão: ");
            comissoes[i] = input.nextDouble();
            total = total + comissoes[i];
        }

        System.out.println(total);

    }

}
