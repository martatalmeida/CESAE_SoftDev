package FichaPratica02;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menu;

        System.out.println("1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair \nEscolha a opção: ");
        menu = input.nextInt();


        switch (menu) {
            case 1:
                System.out.println("1. Criar");
                break;
            case 2:
                System.out.println("2. Atualizar");
                break;
            case 3:
                System.out.println("3. Eliminar");
                break;
            case 4:
                System.out.println();
                break;
            default:
                System.out.println("A opção é inválida");
                break;
        }

    }
}