package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, adiv;

        num = 44;

        System.out.println("Adivinhe o número: ");
        adiv = input.nextInt();

        if (adiv < num) {
            System.out.println("Menor");
            System.out.println("Adivinhe o número: ");
            adiv = input.nextInt();
            if (adiv < num) {
                System.out.println("Menor.");
                System.out.println("Ficaste sem tentativas");
            }
            if (adiv > num) {
                System.out.println("Maior.");
                System.out.println("Ficaste sem tentativas");
            }
            if (adiv == num) {
                System.out.println("Acertaste");
            }
        } else if (adiv > num) {
            System.out.println("Maior");
            System.out.println("Adivinhe o número: ");
            adiv = input.nextInt();
            if (adiv < num) {
                System.out.println("Menor.");
                System.out.println("Ficaste sem tentativas");
            }
            if (adiv > num) {
                System.out.println("Maior.");
                System.out.println("Ficaste sem tentativas");
            }
            if (adiv == num) {
                System.out.println("Acertaste");
            }
        } else if (adiv == num) {
            System.out.println("Acertaste");
        }

    }

}
