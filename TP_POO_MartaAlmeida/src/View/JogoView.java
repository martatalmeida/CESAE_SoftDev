package View;

import Controllers.JogoController;
import Domain.Personagem.Entidade;
import Domain.Personagem.Heroi;
import Domain.Personagem.NPC;
import Domain.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class JogoView {

    public JogoView() {
    }

    public static Heroi menuCriarPersonagem() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        JogoController jogoController = new JogoController();
        Heroi heroi = null;

        System.out.println("***** Bem-Vindo ao Jogo *****");


        /* Criação da Personagem */

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

        while (forca + vida > pontos) {
            System.out.println("Atribuiu demasiados pontos de criação. Volte a atribuir os " + pontos + " pontos de criação.");
            System.out.println("Quantos pontos de criação quer atribuir à vida da personagem?");
            vida = input.nextInt();

            System.out.println("Restam-lhe " + (pontos - vida) + " pontos de criação. Quantos pontos de criação quer atribuir à força da personagem?");
            forca = input.nextInt();
        }

        if (forca + vida <= pontos) {
            heroi = jogoController.criarPersonagem(tipo, nome, dificuldade, vida, forca);
        }
        return heroi;
    }

    public static void Jogo(Heroi heroi) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        JogoController jogoController = new JogoController();
        Heroi heroiInicial = heroi;

        NPC orc = new NPC("Orc", 80, 15,40);
        NPC goblin = new NPC("Goblin", 70,20,50);

        System.out.println("\n\n **** Início do Jogo **** ");

        System.out.println("\n\nNo ano de ..., o exército das sombras amaldiçoou os dragões, metendo-os num sono profundo.");
        System.out.println("Assim, os humanos, que viviam em harmonia com os dragões viram as suas defesas enfraquecidas.");
        System.out.println("Durante os anos que se seguiram o exército das sombras conquistou e destruiu cidades onde humanos, elfos e feiticeiros viviam.");
        System.out.println("Hoje, apenas Arcádia, a capital do reino, se mantém de pé.");
        System.out.println("A única hipótese de parar o exército é com o poder dos dragões.");
        System.out.println("Há uma antiga biblioteca perdida no meio da montanha onde se diz haver um livro que contém a solução para quebrar a maldição.");
        System.out.println("É a tua missão encontrar esse livro!");
        System.out.println("Encontras-te na floresta ao lado da cidade.");
        System.out.println("Passa por ti um vendedor ambulante cheio de itens. É melhor abasteceres-te antes de começares a tua jornada.");

        Vendedor vendedor = new Vendedor();
        jogoController.loja(vendedor,heroi);

        System.out.println("\nAgora tens de escolher por que caminho queres ir?");
        System.out.println("1. Continuar pelo caminho conhecido que tem muita luz, mas é mais demorado.");
        System.out.println("2. Cortar caminho e ir pelo caminho escuro.");
        System.out.println("Qual escolhes?");
        int caminho = input.nextInt();

        switch (caminho){

            /* Escolhe o caminho com luz*/
            case 1:
                System.out.println("\nComeças a andar e acabas por encontrar uma fonte com água e apercebes-te que tens muita sede.");
                System.out.println("1. Bebes água da fonte");
                System.out.println("2. Achas melhor não beber e continuas o caminho.");
                System.out.println("O que preferes?");
                int agua = input.nextInt();

                switch (agua){

                    /*Escolhe beber água*/
                    case 1:
                        System.out.println("\nBebes a água, mas não era potável então perdes 20 pontos de vida.");
                        jogoController.agua(heroi,agua);
                        break;

                    /*Escolhe não beber água*/
                    case 2:
                        System.out.println("\nNão bebes água então ficas mais fraco e perdes 5 pontos de força.");
                        jogoController.agua(heroi,agua);
                        break;
                }
                break;

            /*Escolhe o caminho escuro*/
            case 2:
                System.out.println("\nComeças a andar e acabas por encontrar um templo em ruínas.");
                System.out.println("1. Decides entrar para explorar.");
                System.out.println("2. Não queres perder tempo então continuas o caminho.");
                int ruinas = input.nextInt();

                switch (ruinas){

                    /*Escolhe explorar as ruínas*/
                    case 1:
                        System.out.println("\nEntras no templo e começas a explorar, mas encontras um dos soldados do exército das sombras.");
                        System.out.println("De forma a saíres do templo tens de lutar.");
                        Entidade vencedor = jogoController.atacar(heroi,orc);
                        if (vencedor == heroi){
                            System.out.println("\nParabéns! Conseguiste derrotar o inimigo!");
                        } else {
                            System.out.println("\nPerdeste! :( Podes:");
                            System.out.println("1. Jogar novamente com a mesma personagem.");
                            System.out.println("2. Criar uma nova personagem.");
                            System.out.println("3. Fechar o jogo.");
                            System.out.println("O que queres fazer?");
                            int perder = input.nextInt();

                            jogoController.perder(perder,heroiInicial);
                        }
                        break;

                    /*Escolhe não explorar ruínas*/
                    case 2:
                        System.out.println("\nContinuas caminho e acabas por encontrar um inimigo morto. Reparas que ele tem uma poção e guardas no teu inventário.");
                        jogoController.encontrarPocao(heroi);
                        break;
                }
                break;
        }

        System.out.println("\nAndas mais um bocado e chegas a um rio. Para passar tens três opções");
        System.out.println("1. Ir por uma ponte quase a cair.");
        System.out.println("2. Pedir boleia a um barqueiro duvidoso.");
        System.out.println("3. Ir a nadar até ao outro lado.");
        System.out.println("Qual preferes?");
        int rio = input.nextInt();

        switch (rio){

            /*Escolhe ir pela ponte quase a cair*/
            case 1:
                System.out.println("\nComeças a passar a ponte e do nada aparece um goblin. Para conseguires passar para o outro lado tens de o derrotar.");
                Entidade vencedor = jogoController.atacar(heroi,goblin);

                if (vencedor == heroi){
                    System.out.println("\nParabéns! Conseguiste derrotar o inimigo!");
                } else {
                    System.out.println("\nPerdeste! :( Podes:");
                    System.out.println("1. Jogar novamente com a mesma personagem.");
                    System.out.println("2. Criar uma nova personagem.");
                    System.out.println("3. Fechar o jogo.");
                    System.out.println("O que queres fazer?");
                    int perder = input.nextInt();

                    jogoController.perder(perder,heroiInicial);
                }
                break;

            /*Escolhe ir ter com o barqueiro*/
            case 2:
                System.out.println("\nVais ter com o barqueiro e ele pede 5 moedas de ouro para te levar.");
                heroi.setOuro(heroi.getOuro()-5);
                break;

            /*Escolhe ir a nadar*/
            case 3:
                System.out.println("\nComeças a atravessar o rio, mas a corrente é muito forte e acabas por te afogar.");
                System.out.println("\nPerdeste! :( Podes:");
                System.out.println("1. Jogar novamente com a mesma personagem.");
                System.out.println("2. Criar uma nova personagem.");
                System.out.println("3. Fechar o jogo.");
                System.out.println("O que queres fazer?");
                int perder = input.nextInt();

                jogoController.perder(perder,heroiInicial);
                break;
        }

        System.out.println("Conseguiste atravessar o rio e encontras outro vendedor. Ele mostra os itens que tem à venda.");
        jogoController.loja(vendedor,heroi);


    }


}
