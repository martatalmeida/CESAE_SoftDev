package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File ("FichaPratica_07/exercicio_03.txt");
        Scanner scanner = new Scanner(file);

        File fileNovo = new File("FichaPratica_07/exercicio_03novo.txt");
        PrintWriter printWriter = new PrintWriter(fileNovo);

        String linha;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            printWriter.println(linha);
        }

        scanner.close();


        printWriter.close();

    }

}
