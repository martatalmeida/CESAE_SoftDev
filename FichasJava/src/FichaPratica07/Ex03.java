package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File ("FichaPratica_07/exercicio_03.txt");
        Scanner scanner = new Scanner(file);

        String conteudo = "";

        while (scanner.hasNextLine()) {
            conteudo += scanner.nextLine() + "\n";
        }

        scanner.close();

        File fileNovo = new File("FichaPratica_07/exercicio_03");
        PrintWriter printWriter = new PrintWriter(fileNovo);

        printWriter.println(conteudo + "\n");

        printWriter.close();

    }

}
