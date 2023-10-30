package FichaPratica04;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, tentativas;

        tentativas = 0;

        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        do {
            System.out.println("Tente acertar no valor: ");
            num2 = input.nextInt();

            if (num2 < num1) {
                System.out.println("O valor introduzido é inferior");
            }
            if (num2 > num1) {
                System.out.println("O valor introduzido é superior");
            }

            tentativas++;

        } while (num1 != num2);

        System.out.println("Nº de tentativas: " + tentativas);


    }

}
