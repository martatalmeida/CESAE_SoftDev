package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("Insira um número: ");
        num1= input.nextDouble();

        System.out.println("Insira um número: ");
        num2= input.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        }
        if (num2 > num1) {
            System.out.println(num2 + " " + num1);
        }
        if (num1 == num2) {
            System.out.println("Os números são iguais");
        }
    }
    }

