package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex04 {

    public static void imprimirTabuada(int num) {

        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.println(num + "x" + i + "=" + res);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Insira um numero: ");
        numero = input.nextInt();

        imprimirTabuada(numero);

    }

}
