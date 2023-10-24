package FichaPratica02;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double codigo, numdias, vencimento, subsidio, irs;
        String cargo;

        System.out.print("Código do funcionário: ");
        codigo = input.nextDouble();

        System.out.println("Cargo: ");
        cargo = input.next();

        System.out.print("Número de dias: ");
        numdias = input.nextDouble();


        switch (cargo) {
            case "E":
                vencimento = numdias * 40;
                System.out.println("Valor ilíquido a receber do vencimento: " + (vencimento));
                subsidio = numdias * 5;
                System.out.println("Subsídio de alimentação: " + subsidio);
                if (vencimento < 1000) {
                    irs = vencimento * 0.1;
                    System.out.println("Valor da retenção de IRS: " + irs);
                } else {
                    irs = vencimento * 0.2;
                    System.out.println("Valor da retenção de IRS: " + irs);
                }
                System.out.println("Valor a entregar à Segurança Social: " + ((vencimento * 0.11) + ((vencimento / (1 - 0.2375)) - vencimento)));
                System.out.println("Valor líquido a receber pelo funcionário: " + (vencimento - irs - (vencimento * 0.11)));
                break;
            case "C":
                vencimento = numdias * 60;
                System.out.println("Valor ilíquido a receber do vencimento: " + (vencimento));
                subsidio = numdias * 7.5;
                System.out.println("Subsídio de alimentação: " + subsidio);
                if (vencimento < 1000) {
                    irs = vencimento * 0.1;
                    System.out.println("Valor da retenção de IRS: " + irs);
                } else {
                    irs = vencimento * 0.2;
                    System.out.println("Valor da retenção de IRS: " + irs);
                }
                System.out.println("Valor a entregar à Segurança Social: " + ((vencimento * 0.11) + ((vencimento / (1 - 0.2375)) - vencimento)));
                System.out.println("Valor líquido a receber pelo funcionário: " + (vencimento - irs - (vencimento * 0.11)));
                break;
            case "A":
                vencimento = numdias * 80;
                System.out.println("Valor ilíquido a receber do vencimento: " + (vencimento));
                subsidio = numdias * 7.5;
                System.out.println("Subsídio de alimentação: " + subsidio);
                if (vencimento < 1000) {
                    irs = vencimento * 0.1;
                    System.out.println("Valor da retenção de IRS: " + irs);
                } else {
                    irs = vencimento * 0.2;
                    System.out.println("Valor da retenção de IRS: " + irs);
                }
                System.out.println("Valor a entregar à Segurança Social: " + ((vencimento * 0.09) + ((vencimento / (1 - 0.21)) - vencimento)));
                System.out.println("Valor líquido a receber pelo funcionário: " + (vencimento - irs - (vencimento * 0.09)));
                break;
        }
    }
}


