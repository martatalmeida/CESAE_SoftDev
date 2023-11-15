package TrabalhoPraticoPE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MartaAlmeida {

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




    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File file = new File("src/TrabalhoPraticoPE/GameStart_V2.csv");
        Scanner scanner1 = new Scanner(file);

        File file2 = new File("src/TrabalhoPraticoPE/GameStart_V2.csv");
        Scanner scanner2 = new Scanner(file2);

        String linha1 = scanner1.nextLine();
        String linha2;
        int numLinhas = 0;

        //Descobrir o número de linhas do ficheiro
        while (scanner1.hasNextLine()) {
            linha1 = scanner1.nextLine();
            numLinhas++;
        }

        //Colocar os dados do ficheiro numa matriz
        String[][] matriz = new String[numLinhas][9];

        linha2 = scanner2.nextLine();

        while (scanner2.hasNextLine()) {
            for (int i = 0; i < matriz.length; i++) {
                linha2 = scanner2.nextLine();
                String [] itensLinha = linha2.split(";");
                for (int col = 0; col < itensLinha.length; col++) {
                    matriz[i][col] = itensLinha[col];
                }
            }
        }


        // Inicio do código do menu de login
        String utilizador, password;
        int opcao1, opcao2, numVendas;
        double valorTotal, lucroTotal;

        String passCerta = "Pass1234";

        System.out.println("Tipo de Utilizador (ADMIN || CLIENTE): ");
        utilizador = input.next();

        switch (utilizador) {
            case "ADMIN":
                System.out.println("Password: ");
                password = input.next();

                while(!password.equals(passCerta)) {
                    System.out.println("Password Incorreta");
                    System.out.println("Password: ");
                    password = input.next();
                }

                if (password.equals(passCerta)){
                    do {
                        System.out.println("\n*** Menu ***");
                        System.out.println("1. Conteúdo na consola");
                        System.out.println("2. Quantas vendas foram executadas e o seu valor total");
                        System.out.println("3. Calcule o total de lucro");
                        System.out.println("4. Informações associadas a um cliente");
                        System.out.println("5. Qual o jogo mais caro e os clientes que o compraram");
                        System.out.println("6. Sair");

                        System.out.println("\nEscolha uma opção: ");
                        opcao1 = input.nextInt();

                        switch (opcao1) {
                            case 1:
                                imprimirConteudo(matriz);
                                break;
                            case 2:
                                numVendas = numLinhas;
                                valorTotal = valorTotalVendas(matriz);
                                System.out.println("Número de Vendas Total: " + numVendas);
                                System.out.println("Valor total de Vendas: " + valorTotal);
                                break;
                            case 3:
                                valorTotal = valorTotalVendas(matriz);
                                lucroTotal = valorTotal * 0.2;
                                System.out.println("Lucro total da GameStart: " + lucroTotal);
                                break;
                        }

                    } while(opcao1 != 6);
                }
                break;

            case "CLIENTE":
                do {
                    System.out.println("*** Menu ***");
                    System.out.println("1. Registar Cliente");
                    System.out.println("2. Procurar Estacionamento");
                    System.out.println("3. Todos os títulos de jogos");
                    System.out.println("4. Todas as categorias e respetivos jogos de uma Editora");

                    System.out.println("\n Escolha uma opção: ");
                    opcao2 = input.nextInt();

                } while (opcao2 != 5);
        }

    }

}
