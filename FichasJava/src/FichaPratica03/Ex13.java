package FichaPratica03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, quant, numAtual, numAnterior, res, neg;

        System.out.println("Quantos números deseja inserir: ");
        quant = input.nextInt();

        num = 1;
        res = 1;
        neg = 1;

        System.out.println("Insira um número: ");
        numAnterior = input.nextInt();

        while (num < quant) {
            System.out.println("Insira um número");
            numAtual = input.nextInt();
            num = num + 1;
            if (numAtual > numAnterior) {
                res = 1;
            } else {
                res = 0;
                neg = 0;
            }
            numAnterior = numAtual;
        }

        if (res == 1 && neg != 0) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }


    }
}
