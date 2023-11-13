package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File file = new File("FichaPratica_07/exercicio_08.txt");
        Scanner scanner = new Scanner(file);

        String linha, palavra;
        String conteudo = "";

        System.out.println("Palavra especifica: ");
        palavra = input.next();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] palavras = linha.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i].equals(palavra)){
                    conteudo += linha + "\n";
                }
            }
        }

        scanner.close();

        File fileNovo = new File("FichaPratica_07/exercicio_08novo.txt");
        PrintWriter printWriter = new PrintWriter(fileNovo);

        printWriter.println(conteudo);

        printWriter.close();
    }

}
