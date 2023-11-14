package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_10.csv");
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();
        String tipo, produto;
        double total =0;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] informacoes = linha.split(",");

        }

        System.out.println("O valor total das vendas é " + total);

    }

}
