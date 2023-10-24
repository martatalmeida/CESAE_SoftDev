package FichaPratica03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, inteiros;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        inteiros = num1;

        while (inteiros >= num1 && inteiros <= num2) {
            System.out.println(inteiros);
            inteiros = inteiros + 1;
        }

    }

}
