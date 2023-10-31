package FichaPratica05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[12];
        int n = 0;
        int i = 0;
        double total = 0;

        while (i < 12) {
            System.out.println("Insira uma comissão: ");
            comissoes[n] = input.nextDouble();
            i++;
            total = total + comissoes[n];
            n++;
        }

        System.out.println(total);

    }

}
