package FichaPratica02;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, credito;

        System.out.println("Insira o saldo médio: ");
        saldo = input.nextDouble();

        if (saldo <= 2000) {
            System.out.println(saldo + "\nNenhum crédito");
        }
        if (saldo > 2000 && saldo <= 4000) {
            credito = saldo * 0.2;
            System.out.println(saldo + "\nCrédito de " + credito);
        }
        if (saldo > 4000 && saldo <= 6000) {
            credito = saldo * 0.3;
            System.out.println(saldo + "\nCrédito de " + credito);
        }
        if (saldo > 6000) {
            credito = saldo * 0.4;
            System.out.println(saldo + "\nCrédito de " + credito);
        }

    }

}
