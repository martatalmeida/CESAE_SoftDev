package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso, lua;

        System.out.println("Insira o seu peso: ");
        peso = input.nextDouble();

        if (peso > 0) {
            lua = peso * 0.16;
            System.out.println("Peso na lua: " + lua + "Kg");
        }

    }
}
