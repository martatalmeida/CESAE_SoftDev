package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("FichaPratica_07/exercicio_07.txt");
        Scanner scanner1 = new Scanner(file1);


        String linha;
        int numLinhas = 0, numPalavras = 0;

        while (scanner1.hasNextLine()) {
            numLinhas++;
            linha = scanner1.nextLine();
            String[] palavras = linha.split(" ");
            numPalavras += palavras.length;
        }


        System.out.println("Nº de Linhas: " + numLinhas);
        System.out.println("Nº de Palavras: " + numPalavras);

        scanner1.close();

    }

}
