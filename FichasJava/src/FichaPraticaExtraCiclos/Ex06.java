package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numAtual, menor, maior;

        System.out.println("Insira um número: ");
        numAtual = input.nextInt();

        menor = numAtual;
        maior = numAtual;

        while (numAtual != 0) {
            System.out.println("Insira um número: ");
            numAtual = input.nextInt();
            if (numAtual != 0) {
                if (numAtual < menor) {
                    menor = numAtual;
                }
                if (numAtual > maior) {
                    maior = numAtual;
                }
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

    }

}
