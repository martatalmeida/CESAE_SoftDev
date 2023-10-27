package FichaPratica03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, mult5;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        mult5 = num1;

        while (mult5 >= num1 && mult5 <= num2) {
            if (mult5 % 5 == 0) {
                System.out.println(mult5);
            }
            mult5 = mult5 + 1;
        }

    }
}
