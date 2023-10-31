package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Insira uma letra: ");
        letra = input.next();

        switch (letra) {
            case "a" :
                System.out.println("Vogal");
                break;
            case "e" :
                System.out.println("Vogal");
                break;
            case "i" :
                System.out.println("Vogal");
                break;
            case "o" :
                System.out.println("Vogal");
                break;
            case "u" :
                System.out.println("Vogal");
                break;
            default :
                System.out.println("Consoante");
                break;
        }  


    }

}
