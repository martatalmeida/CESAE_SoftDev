package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {

    public static void procurarPorGenero(String[][] matriz, String genero) throws FileNotFoundException {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2].equals(genero)) {
                System.out.println(matriz[i][0]);
            }
        }
    }

    public static void procurarPorArtista(String[][] matriz, String artista) throws FileNotFoundException {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1].equals(artista)) {
                System.out.println(matriz[i][0]);
            }
        }
    }

    public static String maiorDuracao(String[][] matriz) {

        String maiorMusica = "";
        int minutos = 0, segundos = 0, duracao = 0, maiorDuracao = 0;


        String[][] tempo = new String[matriz.length][2];

        for (int i = 0; i < matriz.length; i++) {
            tempo[i] = matriz[i][3].split(":");
            minutos = Integer.parseInt(tempo[i][0]);
            segundos = Integer.parseInt(tempo[i][1]);
            duracao = minutos + segundos;
            if (duracao > maiorDuracao) {
                maiorDuracao = duracao;
                maiorMusica = matriz[i][0];
            }
        }
        return maiorMusica;
    }


    public static void duracaoAcimaValor(String[][] matriz, int minutos, int segundos) {

        int minMusica, segMusica;

        String[][] tempo = new String[matriz.length][2];

        for (int i = 0; i < matriz.length; i++) {
            tempo[i] = matriz[i][3].split(":");
            minMusica = Integer.parseInt(tempo[i][0]);
            segMusica = Integer.parseInt(tempo[i][1]);
            if (minMusica > minutos) {
                System.out.println(matriz[i][0]);
            }
            if (minMusica == minutos) {
                if (segMusica > segundos) {
                    System.out.println(matriz[i][0]);
                }
            }

        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File file = new File("FichaPratica_07/exercicio_11.csv");
        Scanner scanner = new Scanner(file);

        File file2 = new File("FichaPratica_07/exercicio_11.csv");
        Scanner scanner2 = new Scanner(file2);

        String linha, linha2, genero, artista, maiorMusica;
        int numLinhas = 0, opcao, minutos, segundos, numMusicas;

        linha = scanner.nextLine();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            numLinhas++;
        }

        String[][] matriz = new String[numLinhas][4];

        linha2 = scanner2.nextLine();

        while (scanner2.hasNextLine()) {
            for (int i = 0; i < numLinhas; i++) {
                linha2 = scanner2.nextLine();
                String[] itensLinha = linha2.split(",");
                for (int col = 0; col < itensLinha.length; col++) {
                    matriz[i][col] = itensLinha[col];
                    System.out.print(matriz[i][col] + " ");
                }
                System.out.println(" ");
            }
        }

        scanner.close();
        scanner2.close();

        do {
            System.out.println("\n***Menu***");
            System.out.println("1. Pesquisar por músicas de um determinado género");
            System.out.println("2. Pesquisar músicas de  um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
            System.out.println("5. Número de músicas no ficheiro");

            System.out.println("\nEscolha uma opçao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Diga um genero: ");
                    input.nextLine();
                    genero = input.nextLine();
                    procurarPorGenero(matriz, genero);
                    break;
                case 2:
                    System.out.println("Diga o artista:");
                    input.nextLine();
                    artista = input.nextLine();
                    procurarPorArtista(matriz, artista);
                    break;
                case 3:
                    maiorMusica = maiorDuracao(matriz);
                    System.out.println("Maior música: " + maiorMusica);
                    break;
                case 4:
                    System.out.println("Diga os minutos minimos: ");
                    minutos = input.nextInt();
                    System.out.println("Diga os segundos minimos: ");
                    segundos = input.nextInt();
                    duracaoAcimaValor(matriz, minutos, segundos);
                    break;
                case 5:
                    numMusicas = numLinhas;
                    System.out.println(numMusicas);
                    break;
            }

        } while (opcao != 6);

    }

}
