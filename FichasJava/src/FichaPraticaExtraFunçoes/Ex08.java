package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex08 {

    public static boolean vogal(String letra) {

        switch (letra) {
            case "a":
                return true;
            case "e":
                return true;
            case "i":
                return true;
            case "o":
                return true;
            case "u":
                return true;
            default:
                return false;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Insira uma letra: ");
        letra = input.next();

        if (vogal(letra)){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

    }

}
