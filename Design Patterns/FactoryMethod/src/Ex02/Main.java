package Ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tipo de Taco [Vaca][Frango][Vegetariano]:");
        String tipo = input.next();

        Taco taco = TacoFactory.criarTaco(tipo);

        taco.prepare();
        taco.bake();
        taco.box();

    }

}
