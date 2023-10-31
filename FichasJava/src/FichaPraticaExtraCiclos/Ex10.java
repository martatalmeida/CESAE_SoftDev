package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, digito;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        while (num != 0) {
            digito = num % 10;
            num = num / 10;
            System.out.print(digito);
        }


    }

}
