package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex02 {

    public static double media(int num1, int num2, int num3) {

        double media;

        media = (num1 + num2 + num3) / 3;

        return media;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;
        double media;

        System.out.println("Insira um número: ");
        n1 = input.nextInt();

        System.out.println("Insira um número: ");
        n2 = input.nextInt();

        System.out.println("Insira um número: ");
        n3 = input.nextInt();

        media = media(n1, n2, n3);
        System.out.println("Média: " + media);

    }

}
