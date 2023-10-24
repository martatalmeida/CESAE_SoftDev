package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, soma, media;

        num = 0;
        soma = 0;
        media = num;


        while (num != -1) {
            System.out.println("Insira um número: ");
            num = input.nextInt();
            if (num != -1) {
                soma = soma + 1;
                media = media + num;
            }
        }

        System.out.println("Média: " + (media/soma));
    }


}
