package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex01 {

    public static int numeroMaisPequeno(int num1, int num2, int num3) {

        int menor = 0;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        }
        if (num2 < num1 && num2 < num3) {
            menor = num2;
        }
        if (num3 < num1 && num3 < num2) {
            menor = num3;
        }
        return menor;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;
        int numMenor;

        System.out.println("Insira um número: ");
        n1 = input.nextInt();

        System.out.println("Insira um número: ");
        n2 = input.nextInt();

        System.out.println("Insira um número: ");
        n3 = input.nextInt();

        numMenor = numeroMaisPequeno(n1, n2, n3);
        System.out.println("Número Menor: " + numMenor);
    }

}