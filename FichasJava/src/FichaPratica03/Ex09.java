package FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, pares;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        pares = 2;

        while (pares >= 2 && pares <= num) {
            System.out.println(pares);
            pares = pares + 2;
        }

    }

}
