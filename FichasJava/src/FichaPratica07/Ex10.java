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
        double quantidade, valor, valorTotal, total =0;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] informacoes = linha.split(",");
            tipo = informacoes[0];
            produto = informacoes[1];
            quantidade = Double.parseDouble(informacoes[2]);
            valor = Double.parseDouble(informacoes[3]);
            valorTotal = quantidade * valor;
            total += valorTotal;
        }

        System.out.println("O valor total das vendas é " + total);

        scanner.close();

    }

}
