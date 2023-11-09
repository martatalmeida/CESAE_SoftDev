package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex07 {

    public static void inverterInteiro(int num) {

        int digito;

        while (num != 0) {
            digito = num % 10;
            num = num/10;
            System.out.print(digito);
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInteiro;

        System.out.println("Insira um numero: ");
        numInteiro = input.nextInt();

        inverterInteiro(numInteiro);


    }

}
