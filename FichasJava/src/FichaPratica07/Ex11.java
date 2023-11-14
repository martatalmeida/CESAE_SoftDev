package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {

    public static void procurarPorGenero(String genero) throws FileNotFoundException {

        String linha;

        File file = new File("FichaPratica_07/exercicio_11.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");

            if (genero.equals(itensLinha[2])) {
                System.out.println(linha);
            }

        }
        scanner.close();

    }

    public static void procurarPorArtista(String artista) throws FileNotFoundException {

        File file = new File("FichaPratica_07/exercicio_11.csv");
        Scanner scanner = new Scanner(file);

        String linha;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");

            if (artista.equals(itensLinha[1])) {
                System.out.println(linha);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File file = new File("FichaPratica_07/exercicio_11.csv");
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);
        Scanner scanner3 = new Scanner(file);

        String linha, linha3, genero, artista;
        int numLinhas = 0, contador = 0, opcao;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            numLinhas++;
        }





        String[][] matriz = new String[numLinhas][4];


        String linha2 = scanner2.nextLine();
        while (scanner2.hasNextLine()) {
            for (int i = 0; i < numLinhas; i++) {
                linha2 = scanner2.nextLine();
                String[] itensLinha = linha2.split(",");
                for (int col = 0; col < itensLinha.length; col++) {
                    matriz[i][col] = itensLinha[col];
                    System.out.print(matriz[i][col] + " ");
                }
                System.out.println("");
            }

            }


        do{
            System.out.println("\n***Menu***");
            System.out.println("1. Pesquisar por músicas de um determinado género");
            System.out.println("2. Pesquisae músicas de  um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
            System.out.println("5. Número de músicas no ficheiro");

            System.out.println("\nEscolha uma opçao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Diga um genero: ");
                    genero = input.next();
                    procurarPorGenero( genero);
                    break;
                case 2:
                    System.out.println("Diga o artista:");
                    artista = input.next();
                    procurarPorArtista( artista);
                    break;
            }

        }while(opcao != 6);

    }

}
