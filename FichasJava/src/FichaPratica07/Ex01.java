package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File ficheiro = new File("FichaPratica_07/exercicio_01_Alternativa02.txt");
        Scanner scanner = new Scanner(ficheiro);

        String linha;

        while(scanner.hasNextLine()) {
            linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();

    }

}
