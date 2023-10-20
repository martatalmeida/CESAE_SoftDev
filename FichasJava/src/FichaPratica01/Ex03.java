package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int comprimento, largura, perimetro, area;

        System.out.print("Insira o comprimento do retângulo: ");
        comprimento= input.nextInt();

        System.out.print("Insira a largura do retângulo: ");
        largura= input.nextInt();

        perimetro=largura+largura+comprimento+comprimento;
        area=largura*comprimento;

        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);

    }

}
