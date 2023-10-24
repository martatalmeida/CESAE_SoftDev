package FichaPratica02;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, montante, operaçaofinal;

        System.out.println("Saldo da conta bancária: ");
        saldo = input.nextDouble();

        System.out.println("Montante a creditar/debitar: ");
        montante = input.nextDouble();

        operaçaofinal = saldo + montante;

        if (montante >= 0) {
            if (operaçaofinal >= 0) {
                System.out.println("A operação é válida. Saldo: " + operaçaofinal);
            } else {
                System.out.println("A operação é inválida. Saldo insuficiente.");
            }
        } else {
            if (operaçaofinal >= 0) {
                System.out.println("A operação é válida. Saldo: " + operaçaofinal);
            } else {
                System.out.println("A operação é inválida. Saldo Insuficiente.");
            }
        }
    }
}
