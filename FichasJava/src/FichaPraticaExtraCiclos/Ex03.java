package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, multiplicacao, res;

        num = 1;

        do {
            System.out.println("Tabuada do " + num + ":");
            for (multiplicacao = 1; multiplicacao <= 10; multiplicacao++) {
                res = num*multiplicacao;
                System.out.println(num + " x " + multiplicacao + " = " + res);
            }
            num++;
            System.out.println(" ");
        } while (num <= 10);

    }

}
