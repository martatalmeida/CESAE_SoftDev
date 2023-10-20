package FichaPratica01;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

       double codigo, numdias, vencimento, subsidio, irs, segurançaFunc, segurançaEmp;

       System.out.print("Código do funcionário: ");
       codigo = input.nextDouble();

       System.out.print("Número de dias: ");
       numdias = input.nextDouble();

       vencimento = numdias * 40;
       subsidio = numdias * 5;
       irs = vencimento * 0.1;
       segurançaFunc = (vencimento * 0.11);
       segurançaEmp = (vencimento / (1 - 0.2375)) - vencimento;

       System.out.println("Valor ilíquido do a receber do vencimento: " + vencimento);
       System.out.println("Subsídio de alimentação: " + subsidio);
       System.out.println("Valor da retenção de IRS: " + irs);
       System.out.println("Valor a entregar à Segurança Social: " + (segurançaFunc + segurançaEmp));
       System.out.print("Valor líquido a receber pelo funcionário: " + (vencimento-irs-segurançaFunc));



    }

}
