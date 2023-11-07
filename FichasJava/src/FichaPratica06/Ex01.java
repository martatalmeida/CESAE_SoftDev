package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "Cao" :
                System.out.println("Au au au");
                break;
            case "Gato" :
                System.out.println("Miau");
                break;
            case "Peixe" :
                System.out.println("Glub Glub");
                break;
            case "Vaca" :
                System.out.println("Muuuu");
                break;
            case "Porco" :
                System.out.println("Oinc Oinc");
                break;
            default:
                System.out.println("Barulho Desconhecido");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("Insira um animal: ");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

    }

}
