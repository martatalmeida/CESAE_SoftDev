package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = input.nextDouble();

        media = nota1*0.25 + nota2*0.35 + nota3*0.4;

        if (media >= 9.5) {
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("O aluno não está aprovado");
        }

    }
}
