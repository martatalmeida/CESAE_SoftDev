package FichaPratica03;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, antes, depois;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        antes = num1 - 5;
        depois = num1 + 5;

        while(antes < num1) {
            System.out.println(antes);
            antes++;
        }

        num1 = num1 + 1;

        while (depois >= num1) {
            System.out.println(num1);
            num1++;
        }


    }

}
