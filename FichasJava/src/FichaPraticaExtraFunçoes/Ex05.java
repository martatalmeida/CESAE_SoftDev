package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex05 {

    public static String contarPiada(int piada) {

        String[] bibliotecaPiadas = new String[4];

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice";

        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema? À espera que chegue mais um porque o filme é para mais de 18.";

        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão";

        bibliotecaPiadas[3] = "O que acontece se o Pai Naral morrer? Ele não estará mais em trenós";

        if (piada < 4) {
            return bibliotecaPiadas[piada];
        } else {
            return "A biblioteca só tem 4 piadas.";
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numPiada;

        System.out.println("Introduza um numero para ouvir uma piada: ");
        numPiada = input.nextInt();

        System.out.println(contarPiada(numPiada));

    }

}
