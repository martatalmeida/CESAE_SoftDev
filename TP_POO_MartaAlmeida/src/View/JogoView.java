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

    /**
     * Menu de criação da personagem
     * @return Heroi que foi criado
     */
    public static Heroi menuCriarPersonagem() {

        Scanner input = new Scanner(System.in);

        JogoController jogoController = new JogoController();
        Heroi heroi = null;

        System.out.println("\n*****************************");
        System.out.println("****  Bem-Vindo ao Jogo  ****");
        System.out.println("*****************************");

        /* Criação da Personagem */

        System.out.println("\n\nVamos criar a tua Personagem! ");
        System.out.println("\n*** Tipos de Heroi ***");
        System.out.println("1. Feiticeiro");
        System.out.println("2. Humano");
        System.out.println("3. Elfo");
        System.out.print("Que Heroi queres criar?");
        int tipo = input.nextInt();

        System.out.print("\nNome do Heroi: ");
        String nome = input.next();

        System.out.println("\n*** Dificuldade ***");
        System.out.println("1. Fácil");
        System.out.println("2. Difícil");
        System.out.print("Que dificuldade desejas?");
        int dificuldade = input.nextInt();

        int pontos = 0, vida, forca;
        if (dificuldade == 1) {
            System.out.println("\nTens direito a 300 pontos de criação.");
            pontos = 300;
        } else if (dificuldade == 2) {
            System.out.println("\nTens direito a 200 pontos de criação.");
            pontos = 200;
        }

        System.out.println("\nCada ponto de vida vale 1 ponto de criação e cada ponto de força vale 5 pontos de criação.");

        System.out.println("\nQuantos pontos de criação queres atribuir à vida da personagem?");
        vida = input.nextInt();

        System.out.println("Restam-te " + (pontos - vida) + " pontos de criação. Quantos pontos de criação queres atribuir à força da personagem?");
        forca = input.nextInt();

        while (forca + vida > pontos) {
            System.out.println("Atribuíste demasiados pontos de criação. Volta a atribuir os " + pontos + " pontos de criação.");
            System.out.println("Quantos pontos de criação queres atribuir à vida da personagem?");
            vida = input.nextInt();

            System.out.println("Restam-te " + (pontos - vida) + " pontos de criação. Quantos pontos de criação queres atribuir à força da personagem?");
            forca = input.nextInt();
        }

        if (forca + vida <= pontos) {
            heroi = jogoController.criarPersonagem(tipo, nome, dificuldade, vida, forca);
        }
        return heroi;
    }




    /* Início do Jogo */

    /**
     * O jogo com as salas e as escolhas
     * @param heroi heroi que está a jogar
     * @throws FileNotFoundException se não encontrar o ficheiro com os itens
     */
    public static void buscaPelaSalvacao(Heroi heroi) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        JogoController jogoController = new JogoController();
        Heroi heroiInicial = heroi.heroiInicial();

        NPC goblin = new NPC("Goblin", 90, 15,40);
        NPC troll = new NPC("Troll", 80,20,50);
        NPC orc = new NPC("Orc", 120, 30,20);

        System.out.println("\n\n **** Início do Jogo **** ");

        System.out.println("\nNo ano de 459 da Segunda Era, o exército das sombras amaldiçoou os dragões, metendo-os num sono profundo.");
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

        System.out.println("\nAgora tens de escolher por que caminho queres ir.");
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

                jogoController.usarPocao(heroi);

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
                        System.out.println("\nEntras no templo e começas a explorar, mas encontras um goblin do exército das sombras.");
                        System.out.println("De forma a saíres do templo tens de lutar.");
                        Entidade vencedor = jogoController.atacar(heroi,goblin);
                        if (vencedor == heroi){
                            System.out.println("\nParabéns! Conseguiste derrotar o inimigo!");
                            System.out.println("Ficaste com as " + goblin.getOuro() + " moedas de ouro do goblin.");
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

                jogoController.usarPocao(heroi);

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
                System.out.println("\nComeças a passar a ponte e do nada aparece um troll. Para conseguires passar para o outro lado tens de o derrotar.");
                Entidade vencedor = jogoController.atacar(heroi,troll);

                if (vencedor == heroi){
                    System.out.println("\nParabéns! Conseguiste derrotar o inimigo!");
                    System.out.println("Ficaste com as " + troll.getOuro() + " moedas de ouro do troll.");
                    jogoController.usarPocao(heroi);
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
                int moedas = jogoController.barqueiroOuro();
                System.out.println("\nVais ter com o barqueiro e ele pede-te " + moedas + " moedas de ouro para te levar para o outro lado do rio.");
                if (moedas < heroi.getOuro()) {
                    heroi.setOuro(heroi.getOuro() - moedas);
                    System.out.println("\nTu pagas para conseguir passar.");
                    jogoController.usarPocao(heroi);
                } else {
                    System.out.println("\nTu não tens moedas suficientes para pagar então não podes continuar o jogo. Podes:");
                    System.out.println("1. Jogar novamente com a mesma personagem.");
                    System.out.println("2. Criar uma nova personagem.");
                    System.out.println("3. Fechar o jogo.");
                    System.out.println("O que queres fazer?");
                    int perder = input.nextInt();
                    jogoController.perder(perder,heroiInicial);
                }
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

        /*Aparece o Vendedor*/
        System.out.println("\nConseguiste atravessar o rio e encontras outro vendedor. Ele mostra os itens que tem à venda.");
        jogoController.loja(vendedor,heroi);

        jogoController.usarPocao(heroi);

        System.out.println("\nChegas finalmente à Montanha e tens duas formas de a subir.");
        System.out.println("1. Apanhar um balão de ar quente até ao cimo.");
        System.out.println("2. Escalar a Montanha.");
        System.out.println("Qual é a tua decisão?");
        int montanha = input.nextInt();
        int balao=0,grifo=0;

        switch (montanha) {
            /*Escolhe ir de balão*/
            case 1:
                System.out.println("\nApanhas o balão e começas a subir. Podes escolher:");
                System.out.println("1. Ir um bocado acima das nuvens para tentares avistar a biblioteca.");
                System.out.println("2. Ir direto ao cimo sem passar as nuvens.");
                System.out.println("O que te parece melhor?");
                balao = input.nextInt();

                switch (balao) {

                    /*Escolhe subir acima das nuvens*/
                    case 1:
                        System.out.println("\nSobes acima das nuvens, mas, de repente, aparece um pássaro e fura o balão, fazendo com que caia e morras.");

                        System.out.println("\nPerdeste! :( Podes:");
                        System.out.println("1. Jogar novamente com a mesma personagem.");
                        System.out.println("2. Criar uma nova personagem.");
                        System.out.println("3. Fechar o jogo.");
                        System.out.println("O que queres fazer?");
                        int perder = input.nextInt();

                        jogoController.perder(perder,heroiInicial);

                        break;

                    /*Escolhe ir direto*/
                    case 2:
                        System.out.println("\nConsegues chegar ao topo da Montanha e encontras um orc que está a guardar a porta da biblioteca.");
                        jogoController.usarPocao(heroi);
                        break;
                }

                break;

            /*Escolhe escalar*/
            case 2:
                System.out.println("\nEstás a escalar e encontras um grifo, criatura que faz parte do exército das sombras, a dormir e a tapar a passagem. Podes");
                System.out.println("1. Matar o grifo para passares.");
                System.out.println("2. Tentar ir à volta sem o acordares.");
                grifo = input.nextInt();

                switch (grifo) {

                    /*Escolhe matar o grifo*/
                    case 1:
                        System.out.println("\nConsegues matar o grifo sem o acordar e continuas o caminho até ao cimo da Montanha.");
                        System.out.println("Encontras um orc a guardar a entrada da biblioteca.");
                        jogoController.usarPocao(heroi);
                        break;

                    /*Escolhe ir à volta*/
                    case 2:
                        System.out.println("\nTentas ir à volta, mas o grifo acorda e apercebe-se do que estás a tentar fazer.");
                        System.out.println("Ele pega em ti com as garras e começa a voar. Leva-te para uma das cidades do exército das sombras.");
                        System.out.println("Nunca mais conseguiste voltar para a Montanha e encontrar a biblioteca.");
                        System.out.println("O exército das sombras ganhou a guerra...");

                        System.out.println("\nPodes:");
                        System.out.println("1. Jogar novamente com a mesma personagem.");
                        System.out.println("2. Criar uma nova personagem.");
                        System.out.println("3. Fechar o jogo.");
                        System.out.println("O que queres fazer?");
                        int escolha = input.nextInt();

                        jogoController.perder(escolha,heroiInicial);
                        break;
                }
                break;
        }

        /*Chegaram à entrada da biblioteca*/
        if (balao == 2 || grifo == 1) {
            System.out.println("\nPara conseguires entrar na biblioteca tens de combater.");
            Entidade vencedor = jogoController.atacar(heroi,orc);

            if (vencedor == heroi){
                System.out.println("\nParabéns! Conseguiste derrotar o inimigo!");
                System.out.println("\nEntras na biblioteca e, depois de passar umas horas lá, encontras o livro necessário para salvar o mundo.");
                System.out.println("Os humanos, elfos e feiticeiros ganham a guerra graças a ti! Conseguiste acabar o jogo!");
            } else {
                System.out.println("\nPerdeste! :( Podes:");
                System.out.println("1. Jogar novamente com a mesma personagem.");
                System.out.println("2. Criar uma nova personagem.");
                System.out.println("3. Fechar o jogo.");
                System.out.println("O que queres fazer?");
                int escolha = input.nextInt();

                jogoController.perder(escolha,heroiInicial);
            }
        }


    }


}
