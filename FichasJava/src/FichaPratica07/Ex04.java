package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_04.csv");
        Scanner scanner = new Scanner(file);

        String conteudo;

        while (scanner.hasNextLine()) {
            conteudo = scanner.nextLine();
            System.out.println(conteudo);
        }

        scanner.close();

    }

}
