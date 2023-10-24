package FichaPratica03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, inteiros;

        inteiros = 0;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        while (inteiros >= 0 && inteiros <= num) {
            System.out.println(inteiros);
            inteiros = inteiros + 1;
        }

    }

}
