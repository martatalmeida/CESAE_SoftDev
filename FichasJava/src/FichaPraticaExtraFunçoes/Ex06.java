package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex06 {

    public static double somatorio(int num) {

        int digito, soma = 0;

        while (num != 0) {
            digito = num % 10;
            num = num / 10;
            soma += digito;
        }

        return soma;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInteiro;
        double somaDigitos;

        System.out.println("Insira um numero:");
        numInteiro = input.nextInt();

        somaDigitos = somatorio(numInteiro);
        System.out.println(somaDigitos);

    }

}
