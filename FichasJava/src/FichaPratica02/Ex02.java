package FichaPratica02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Salário: ");
        salario = input.nextDouble();

        if (salario<=15000) {
            System.out.println("Taxa 20%: " + (salario*0.2));
        }
        else {
            System.out.println("Taxa 30%: " + (salario*0.3));
        }
    }
}
