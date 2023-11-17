package TrabalhoPraticoPE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MartaAlmeida {


    public static void menuAdmin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        String[][] matriz = ficheiroParaMatriz("src/TrabalhoPraticoPE/GameStart_V2.csv");

        String idCliente, jogoCaro;
        int opcao, numVendas;
        double valorTotal, lucroTotal;

        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Conteúdo na consola");
            System.out.println("2. Quantas vendas foram executadas e o seu valor total");
            System.out.println("3. Calcule o total de lucro");
            System.out.println("4. Informações associadas a um cliente");
            System.out.println("5. Qual o jogo mais caro e os clientes que o compraram");
            System.out.println("6. Sair");

            System.out.println("\nEscolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    imprimirConteudo(matriz);
                    break;
                case 2:
                    numVendas = contarLinhas("src/TrabalhoPraticoPE/GameStart_V2.csv") - 1;
                    valorTotal = valorTotalVendas(matriz);
                    System.out.println("Número de Vendas Total: " + numVendas);
                    System.out.println("Valor total de Vendas: " + valorTotal);
                    break;
                case 3:
                    valorTotal = valorTotalVendas(matriz);
                    lucroTotal = valorTotal * 0.2;
                    System.out.println("Lucro total da GameStart: " + lucroTotal);
                    break;
                case 4:
                    System.out.println("Insira um idCliente: ");
                    idCliente = input.next();
                    informacoesCliente(matriz, idCliente);
                    break;
                case 5:
                    jogoCaro = jogoMaisCaro(matriz);
                    System.out.println("O jogo mais caro: " + jogoCaro);
                    System.out.println("Clientes que compraram o jogo:");
                    clientesQueCompraramJogo(matriz, jogoCaro);
                    break;
            }

        } while (opcao != 6);
    }

    public static void menuCliente() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        String[][] matriz = ficheiroParaMatriz("src/TrabalhoPraticoPE/GameStart_V2.csv");

        String nomeCliente, contactoCliente, emailCliente, editora;
        int opcao;

        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Registar Cliente");
            System.out.println("2. Procurar Estacionamento");
            System.out.println("3. Todos os títulos de jogos");
            System.out.println("4. Todas as categorias e respetivos jogos de uma Editora");

            System.out.println("\n Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nRegistar Cliente");
                    System.out.println("Insira Nome: ");
                    nomeCliente = input.next();
                    System.out.println("Insira Contacto: ");
                    contactoCliente = input.next();
                    System.out.println("Insira Email: ");
                    emailCliente = input.next();
                    System.out.println("Cliente Inserido com Sucesso: " + nomeCliente + "|" + contactoCliente + "|" + emailCliente + "|");
                    break;
                case 2:
                    System.out.println("Lugares vagos: ");
                    procurarEstacionamento();
                    break;
                case 3:
                    System.out.println("Todos os jogos: ");
                    imprimirTodosOsJogos(matriz);
                    break;
                case 4:
                    System.out.println("Diga uma Editora: ");
                    editora = input.next();
                    todasAsCategoriasEJogos(matriz, editora);
                    break;
            }

        } while (opcao != 5);
    }

    public static int contarLinhas(String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(file);

        int numLinhas = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numLinhas++;
        }
        return numLinhas;
    }

    public static String[][] ficheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(file);

        int numLinhas = contarLinhas(caminhoFicheiro) - 1;

        String[][] matriz = new String[numLinhas][9];

        String linha = scanner.nextLine();
        int linhaAtual = 0;

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matriz[linhaAtual][i] = itensLinha[i];
            }
            linhaAtual++;
        }
        return matriz;
    }

    public static void imprimirConteudo(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[i][col] + " ");
            }
            System.out.println();
        }

    }

    public static double valorTotalVendas(String[][] matriz) {

        double total = 0, valor;

        for (int i = 0; i < matriz.length; i++) {
            valor = Double.parseDouble(matriz[i][8]);
            total += valor;
        }
        return total;
    }

    public static void informacoesCliente(String[][] matriz, String cliente) {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1].equals(cliente)) {
                System.out.println(matriz[i][2] + "\n" + matriz[i][3] + "\n" + matriz[i][4]);
                break;
            }
        }
    }

    public static String jogoMaisCaro(String[][] matriz) {

        double valor, maisCaro = 0;
        String jogo = "";

        for (int i = 0; i < matriz.length; i++) {
            valor = Double.parseDouble(matriz[i][8]);
            if (valor > maisCaro) {
                maisCaro = valor;
                jogo = matriz[i][7];
            }
        }
        return jogo;
    }

    public static void clientesQueCompraramJogo(String[][] matriz, String jogo) {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][7].equals(jogo)) {
                System.out.println(matriz[i][2]);
            }
        }
    }

    public static void procurarEstacionamento() {

        int soma = 0;

        for (int i = 1; i < 121; i++) {
            if (i % 5 == 0) {
                for (int consec = 0; consec < i; consec++) {
                    soma += consec;
                    if (soma == i) {
                        System.out.println(soma);
                    }
                }
                soma = 0;
            }
        }
    }

    public static void imprimirTodosOsJogos(String[][] matriz) {

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int c = i; c < matriz.length; c++) {
                if (matriz[i][7].equals(matriz[c][7])) {
                    contador++;
                }
            }
            if (contador == 1) {
                System.out.println(matriz[i][7]);
            }

            contador = 0;
        }
    }

    public static void todasAsCategoriasEJogos(String[][] matriz, String editora) {


        String[] categorias = new String[matriz.length];
        String[] jogos = new String[matriz.length];
        int contador1 = 0, contador2 = 0;

        System.out.println("\n*** Editora: " + editora + " ***");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][5].equals(editora)) {

                for (int k = i; k < matriz.length; k++) {
                    if (matriz[i][5].equals(matriz[k][5])) {
                        if (matriz[i][6].equals(matriz[k][6])) {
                            contador1++;
                        }
                    }
                }
                if (contador1 == 1) {
                    categorias[i] = matriz[i][6];
                }

                contador1 = 0;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][5].equals(editora)) {
                for (int k = i; k < matriz.length; k++) {
                    if (matriz[i][6].equals(matriz[k][6])) {
                        if (matriz[i][7].equals(matriz[k][7])) {
                            contador2++;
                        }
                    }

                }
                if (contador2 == 1) {
                    jogos[i] = matriz[i][7];
                    if (categorias[i] != null) {
                        System.out.println("\n>> " + categorias[i] + " <<");
                    }
                    for (int l = 0; l < matriz.length; l++) {
                        if (matriz[l][6].equals(categorias[i])) {
                            if (jogos[l] != null) {
                                System.out.println(jogos[l]);
                            }
                        }
                    }
                }
                contador2 = 0;
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);


        String utilizador, password;

        String passCerta = "Pass1234";

        System.out.println("Tipo de Utilizador (ADMIN || CLIENTE): ");
        utilizador = input.next();

        switch (utilizador) {
            case "ADMIN":
                System.out.println("Password: ");
                password = input.next();

                while (!password.equals(passCerta)) {
                    System.out.println("Password Incorreta");
                    System.out.println("Password: ");
                    password = input.next();
                }

                if (password.equals(passCerta)) {
                    menuAdmin();
                }
                break;

            case "CLIENTE":
                menuCliente();
                break;
        }

    }

}
