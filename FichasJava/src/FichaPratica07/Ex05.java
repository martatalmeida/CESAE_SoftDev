package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_05_1999.txt");
        Scanner scanner = new Scanner(file);

        int soma = 0;

        while (scanner.hasNextInt()) {
            soma += scanner.nextInt();
        }

        System.out.println("Soma dos números: " + soma);

        scanner.close();

    }

}
