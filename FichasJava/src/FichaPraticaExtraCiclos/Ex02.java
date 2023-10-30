package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        for (num = 1; num <= 255; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

    }

}
