package FichaPratica02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("Maior: " + num1);
        }
        if (num2>num1) {
            System.out.println("Maior: " + num2);
        }
        if (num1==num2) {
            System.out.println("São iguais");
        }
    }

}
