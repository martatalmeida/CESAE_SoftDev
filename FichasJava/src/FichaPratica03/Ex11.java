package FichaPratica03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, int1, int2, int3, int4;

        num = 0;
        int1 = 0;
        int2 = 0;
        int3 = 0;
        int4 = 0;

        while (num >= 0) {
            System.out.println("Insira um número: ");
            num = input.nextInt();
            if (num >=0 && num <= 25) {
                int1 = int1 + 1;
            }
            if (num > 25 && num <= 50) {
                int2 = int2 + 1;
            }
            if (num > 50 && num <= 75) {
                int3 = int3 + 1;
            }
            if (num > 75 && num <= 100) {
                int4 = int4 + 1;
            }
        }

        System.out.println("[00,25]: " + int1);
        System.out.println("[26,50]: " + int2);
        System.out.println("[51,75]: " + int3);
        System.out.println("[76,100]: " + int4);

    }

}
