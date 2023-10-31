package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano;

        System.out.println("Insira um ano: ");
        ano = input.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }

    }

}
