package FichaPratica01;

import java.util.Scanner;
public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int min1, seg1, min2, seg2, min3, seg3, min4, seg4, min5, seg5, somamin, somaseg, horas, minutos, segundos;

        System.out.print("Introduza minutos da música 1: ");
        min1 = input.nextInt();

        System.out.print("Introduza segundos da música 1: ");
        seg1 = input.nextInt();

        System.out.print("Introduza minutos da música 2: ");
        min2 = input.nextInt();

        System.out.print("Introduza segundos da música 2: ");
        seg2 = input.nextInt();

        System.out.print("Introduza minutos da música 3: ");
        min3 = input.nextInt();

        System.out.print("Introduza segundos da música 3: ");
        seg3 = input.nextInt();

        System.out.print("Introduza minutos da música 4: ");
        min4 = input.nextInt();

        System.out.print("Introduza segundos da música 4: ");
        seg4 = input.nextInt();

        System.out.print("Introduza minutos da música 5: ");
        min5 = input.nextInt();

        System.out.print("Introduza segundos da música 5: ");
        seg5 = input.nextInt();

        somamin = min1 + min2 + min3 + min4 + min5;
        somaseg = seg1 + seg2 + seg3 + seg4 + seg5;
        horas = somamin/60;
        minutos = (somamin % 60) + (somaseg / 60);
        segundos = somaseg%60;



        System.out.print(horas + ":" + minutos + ":" + segundos);


    }


}
