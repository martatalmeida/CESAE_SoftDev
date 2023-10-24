package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, soma;
        num = 1;
        soma = num;

        while (num >= 1 && num < 100) {
            System.out.println(num);
            num = num + 1;
            soma = soma + num ;
        }



        System.out.println("Somatório: " + soma);

    }
}
