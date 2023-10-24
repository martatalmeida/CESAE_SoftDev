package FichaPratica03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, salto, num;

        System.out.println("Insira o limite: ");
        limite = input.nextInt();

        System.out.println("Insira o salto: ");
        salto = input.nextInt();

        num = 0;

        while (num >= 0 && num <= limite) {
            System.out.println(num);
            num = num + salto;
        }

    }

}
