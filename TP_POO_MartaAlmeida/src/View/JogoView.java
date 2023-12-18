package View;

import Controllers.JogoController;
import Domain.Personagem.Heroi;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class JogoView {

    public JogoView() {
    }

    public static void menuCriarPersonagem() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        JogoController jogoController = new JogoController();

        System.out.println("***** Bem-Vindo ao Jogo *****");

        System.out.println("\n\nVamos criar a sua Personagem! ");
        System.out.println("*** Tipos de Heroi ***");
        System.out.println("1. Feiticeiro");
        System.out.println("2. Humano");
        System.out.println("3. Elfo");
        System.out.print("Que Heroi quer criar?");
        int tipo = input.nextInt();

        System.out.print("\nNome do Heroi: ");
        String nome = input.next();

        System.out.println("\n*** Dificuldade ***");
        System.out.println("1. Fácil");
        System.out.println("2. Difícil");
        System.out.print("Que dificuldade deseja?");
        int dificuldade = input.nextInt();

        int pontos = 0, vida, forca;
        if (dificuldade == 1) {
            System.out.println("\nTem direito a 300 pontos de criação.");
            pontos = 300;
        } else if (dificuldade == 2) {
            System.out.println("\nTem direito a 200 pontos de criação.");
            pontos = 200;
        }

        System.out.println("\nCada ponto de vida vale 1 ponto de criação e cada ponto de força vale 5 pontos de criação.");

        System.out.println("Quantos pontos de criação quer atribuir à vida da personagem?");
        vida = input.nextInt();

        System.out.println("Restam-lhe " + (pontos - vida) + "pontos de criação. Quantos pontos de criação quer atribuir à força da personagem?");
        forca = input.nextInt();

        while (forca + vida > 200) {
            System.out.println("Atribuiu demasiados pontos de criação. Volte a atribuir os " + pontos + " pontos de criação.");
            System.out.println("Quantos pontos de criação quer atribuir à vida da personagem?");
            vida = input.nextInt();

            System.out.println("Restam-lhe " + (pontos - vida) + " pontos de criação. Quantos pontos de criação quer atribuir à força da personagem?");
            forca = input.nextInt();
        }

        if (forca + vida <= pontos) {
            Heroi heroi = jogoController.criarPersonagem(tipo, nome, dificuldade, vida, forca);
        }
    }

}
