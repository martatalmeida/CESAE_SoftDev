package FichaPratica06;

import java.util.Scanner;

public class Ex02 {


    /**
     * Método que lê um inteiro positivo do utilizador
     * @return Número Inteiro Positivo
     */
    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);

        int num;

        do{
            System.out.println("Insira um número inteiro positivo: ");
            num = input.nextInt();

        }while(num<0);

        return num;
    }

    public static void imprimirAsteriscos(int numeroAsteriscos) {

        for (int i = 0; i < numeroAsteriscos; i++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {

        int numInteiro = lerInteiroPositivo();

        imprimirAsteriscos(numInteiro);

    }

}
