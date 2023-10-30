package FichaPratica04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, divisor;
        boolean primo = true;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        divisor = 2;

        while (divisor < num) {

            if (num % divisor == 0) {
                primo = false;
            }
            divisor++;
        }

        if (primo){
            System.out.println("É Primo");
        }else {
            System.out.println("Não Primo");
        }


    }

}
