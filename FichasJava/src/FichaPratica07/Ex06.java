package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_06.txt");
        Scanner scanner = new Scanner(file);

        String linha, maisVelho = "";;
        int idade = 0;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");

            if (Integer.parseInt(itensLinha[1]) > idade) {
                idade = Integer.parseInt(itensLinha[1]);
                maisVelho = itensLinha[0];
            }
        }
        System.out.println("Mais velho: " + maisVelho);


        scanner.close();
    }

}
