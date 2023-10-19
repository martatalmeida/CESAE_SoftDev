package FichaPratica01;

import java.util.Scanner;
public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, soma, sub, mult, divisao;

        System.out.print("Insira um número: ");
        num1= input.nextDouble();

        System.out.print("Insira um número: ");
        num2= input.nextDouble();

        soma= num1+num2;
        sub= num1-num2;
        mult= num1*num2;
        divisao= num1/num2;

        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + sub);
        System.out.println("A multiplicação é " + mult);
        System.out.println ("A divisão é " + divisao);



    }

}
