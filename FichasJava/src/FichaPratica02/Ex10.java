package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;
        String operaçao;

        System.out.println("Insira um número: ");
        num1 = input.nextDouble();

        System.out.println("Insira um número: ");
        num2 = input.nextDouble();

        System.out.println("Operação aritmética: ");
        operaçao = input.next();

        switch (operaçao) {
            case "+" :
                System.out.println("Soma: " + (num1+num2));
                break;
            case "-" :
                System.out.println("Subtração: " + (num1-num2));
                break;
            case "*" :
                System.out.println("Multiplicação: " + (num1*num2));
                break;
            case "/" :
                System.out.println("Divisão: " + (num1/num2));
                break;
            default:
                System.out.println("Não foi selecionada nenhum operação");
                break;
        }


                
    }
}
