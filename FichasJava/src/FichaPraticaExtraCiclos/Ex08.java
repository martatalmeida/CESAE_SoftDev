package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, elevar, res;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        elevar = 1;
        res = num1;

        while (elevar < num2) {
            res = res * num1;
            elevar++;
        }

        System.out.println("Resultado: " + res);

    }

}
