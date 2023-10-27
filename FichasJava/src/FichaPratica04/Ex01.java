package FichaPratica04;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        String operaçao, repetiçao;

        do {
            System.out.println("Insira um número: ");
            num1 = input.nextInt();

            System.out.println("Insira um número: ");
            num2 = input.nextInt();

            System.out.println("Operação: ");
            operaçao = input.next();

            switch (operaçao) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Não foi escolhida nenhuma operação");
                    break;
            }

            System.out.println("Deseja continuar?");
            repetiçao = input.next();

        } while (repetiçao.equals("S"));






    }

}
