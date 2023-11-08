package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInteiro, opçao;

        System.out.println("Insira um número: ");
        numInteiro = input.nextInt();

        do {
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de número");
            System.out.println("Escolha uma opção: ");
            opçao = input.nextInt();


            switch (opçao) {
                case 1:
                    if (par(numInteiro)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                    break;
                case 2:
                    if (positivo(numInteiro)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;
                case 3:
                    if (primo(numInteiro)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não Primo");
                    }
                    break;
                case 4:
                    if (perfeito(numInteiro)) {
                        System.out.println("Perfeito");
                    } else {
                        System.out.println("Não Perfeito");
                    }
                    break;
                case 5:
                    if (triangular(numInteiro)) {
                        System.out.println("Triangular");
                    } else {
                        System.out.println("Não Triangular");
                    }
                    break;
                case 6:
                    System.out.println("Insira um número: ");
                    numInteiro = input.nextInt();
                    break;
            }
        } while (opçao != 7);
    }

}
