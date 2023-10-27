package FichaPratica04;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opçao;

        do {
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.println("Escolha uma das opções: ");
            opçao = input.nextInt();

            switch (opçao) {
                case 1 :
                    System.out.println("1. Criar");
                    break;
                case 2 :
                    System.out.println("2. Atualizar");
                    break;
                case 3 :
                    System.out.println("3. Eliminar");
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("A opção não é válida");
                    break;
            }
        } while (opçao != 4);

    }

}
