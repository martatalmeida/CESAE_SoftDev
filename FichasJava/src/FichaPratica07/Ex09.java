package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_09.txt");
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);

        String linha, linha2, palavraMaisRep = "";
        int contador = 0, reps = 0, maisRep = 0;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] palavras = linha.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                contador++;
            }
        }

        String[] array = new String[contador];
        int p = 0;

        while (scanner2.hasNextLine()) {
            linha2 = scanner2.nextLine();
            String[] palavras2 = linha2.split(" ");

            for (int i = 0; i < palavras2.length; i++) {
                array[p] = palavras2[i];
                p++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int c = i; c < array.length; c++) {
                if (array[i].equals(array[c])) {
                    reps++;
                }
            }
            if (reps > maisRep) {
                maisRep = reps;
                palavraMaisRep = array[i];
            }
            reps = 0;
        }

        System.out.println("A palavra mais repetida é " + palavraMaisRep + " e repetiu-se " + maisRep + " vezes");
}
}

