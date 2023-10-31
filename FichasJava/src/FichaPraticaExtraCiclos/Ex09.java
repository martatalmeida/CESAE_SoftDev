package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, soma, digito;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        soma = 0;

        while (num != 0) {
            digito = num % 10;
            num = num / 10;
            soma = soma + digito;
        }

        System.out.println("Soma dos digitos: " + soma);
    }

}
