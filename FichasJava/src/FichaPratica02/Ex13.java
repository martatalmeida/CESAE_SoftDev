package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Insira as horas: ");
        horas = input.nextInt();

        System.out.println("Insira os minutos: ");
        minutos = input.nextInt();

        if (horas > 12 && horas < 24) {
            System.out.println((horas-12) + ":" + minutos + " PM");
        }
        if (horas < 12) {
            System.out.println(horas + ":" + minutos + " AM");
        }
        if (horas == 24) {
            System.out.println((horas-12) + ":" + minutos + " AM");
        }
        if (horas == 12) {
            System.out.println(horas + ":" + minutos + " PM");
        }



    }
}
