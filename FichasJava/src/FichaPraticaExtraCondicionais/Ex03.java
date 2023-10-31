package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor;

        System.out.println("Insira o valor do produto: ");
        valor = input.nextDouble();

        if (valor > 100) {
            valor = valor - (valor*0.1);
            System.out.println("Valor Final: " + valor + " (10% de desconto)");
        } else {
            System.out.println("Valor Final: " + valor + " (Sem desconto)");
        }

    }

}
