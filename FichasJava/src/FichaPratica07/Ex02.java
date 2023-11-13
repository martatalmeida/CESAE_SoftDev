package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("FichaPratica_07/exercicio_02");
        PrintWriter printWriter = new PrintWriter(file);

        String fileContent = "Olá! Adoro programar em Java";

        printWriter.println(fileContent);

        printWriter.close();

    }

}
