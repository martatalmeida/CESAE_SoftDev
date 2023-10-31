package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Insira a sua idade: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }

}
