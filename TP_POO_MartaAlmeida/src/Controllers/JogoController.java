package Controllers;

import Domain.ItensHeroi.*;
import Domain.Personagem.*;
import Domain.Vendedor;
import Repository.ItensRepository;
import View.JogoView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class JogoController {


    public JogoController() {
    }

    /**
     * Método para criar o herói
     * @param tipo tipo de herói que vai ser criado
     * @param nome nome do herói que vai ser criado
     * @param dificuldade a dificuldade do jogo
     * @param vida a vida máxima que o herói vai ter
     * @param forca a força que o herói vai ter
     * @return o herói que vai participar no jogo
     */
    public Heroi criarPersonagem(int tipo, String nome, int dificuldade, int vida, int forca) {

        int ouro = 0;
        if (dificuldade == 1) {
            ouro = 100;
        } else if (dificuldade == 2) {
            ouro = 70;
        }

        int forcaHeroi = forca / 5;

        switch (tipo) {
            case 1:
                return new Feiticeiro(nome, vida, forcaHeroi, 1, ouro);
            case 2:
                return new Humano(nome, vida, forcaHeroi, 1, ouro);
            case 3:
                return new Elfo(nome, vida, forcaHeroi, 1, ouro);
        }
        return null;
    }


    /**
     * Método para as batalhas entre o heroi e os npc
     * @param heroi o heroi que vai lutar
     * @param npc o npc que vai lutar
     * @return a entidade vencedora da batalha
     */
    public Entidade atacar(Heroi heroi, NPC npc) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        Entidade vencedor = null;
        do {
            System.out.println("\n** Tipos de Ataque **");
            System.out.println("\n1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Consumível");
            System.out.println("Que ataque queres usar?");
            int ataque = input.nextInt();

            switch (ataque) {

                /* Ataque Normal */
                case 1:
                    if (heroi instanceof Feiticeiro) {
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                        System.out.println("O heroi atacou");
                        heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                        System.out.println("O inimigo atacou");
                    }
                    if (heroi instanceof Humano) {
                        heroi.setVidaAtual(heroi.getVidaAtual() - npc.getForca());
                        System.out.println("O inimigo atacou");
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                        System.out.println("O heroi atacou");
                    }
                    if (heroi instanceof Elfo) {
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                        System.out.println("O heroi atacou");
                        heroi.setVidaAtual((int) (heroi.getVidaAtual() - (npc.getForca() - (npc.getForca() * 0.2))));
                        System.out.println("O inimigo atacou");
                    }
                    break;

                /* Ataque Especial */
                case 2:
                    if (contador == 0) {
                        if (heroi instanceof Feiticeiro) {
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            System.out.println("O heroi usou ataque especial");
                            heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                            System.out.println("O inimigo atacou");
                            contador++;
                        }
                        if (heroi instanceof Humano) {
                            heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                            System.out.println("O inimigo atacou");
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            System.out.println("O heroi usou ataque especial");
                            contador++;
                        }
                        if (heroi instanceof Elfo) {
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            System.out.println("O heroi usou ataque especial");
                            heroi.setVidaAtual((int) (heroi.getVidaAtual() - (npc.getForca() - (npc.getForca() * 0.2))));
                            System.out.println("O inimigo atacou");
                            contador++;
                        }
                    } else {
                        System.out.println("Já usaste o Ataque Especial nesta luta.");
                    }
                    break;

                /* Ataque Consumível */
                case 3:
                    int indice = 1;
                    ArrayList<Integer> arrayContador = new ArrayList<>();
                    for (Consumivel consumivelAtual : heroi.getInventario()) {
                        if (consumivelAtual instanceof ConsumivelCombate) {
                            System.out.println(indice + ". ");
                            arrayContador.add(indice);
                            consumivelAtual.mostrarDetalhes();
                        }
                        indice++;
                    }

                    int ataqueConsumivel;
                    do {
                        System.out.println("Que Ataque Consumível queres utilizar? Digite 0 se quiseres cancelar este ataque");
                        ataqueConsumivel = input.nextInt();
                        if (ataqueConsumivel != 0) {
                            ConsumivelCombate consumivelCombate = (ConsumivelCombate) heroi.getInventario().get(ataqueConsumivel);
                            npc.setVidaAtual(npc.getVidaAtual() - consumivelCombate.getAtaqueInstantaneo());
                            System.out.println("Usaste um consumível de combate");
                            heroi.getInventario().remove(consumivelCombate);
                        }

                    } while (!arrayContador.contains(ataqueConsumivel) && ataqueConsumivel != 0);
                    break;
            }
        } while (heroi.getVidaAtual() > 0 && npc.getVidaAtual() > 0);


        if (heroi.getVidaAtual() <= 0) {
            vencedor = npc;
        } else if (npc.getVidaAtual() <= 0) {
            vencedor = heroi;
            heroi.setNivel(heroi.getNivel() + 1);
            heroi.setVidaMax(heroi.getVidaMax() + 10);
            heroi.setForca(heroi.getForca() + 1);
            heroi.setOuro(heroi.getOuro() + npc.getOuro());
        }
        return vencedor;
    }

    /**
     * Método para imprimir o inventário de poções do heroi e usar uma poção
     * @param heroi heroi que vai usar a poção
     */
    public void usarPocao(Heroi heroi) {
        Scanner input = new Scanner(System.in);
        String escolha ="";
        boolean pocoes = false;
            do {
                if (!heroi.getInventario().isEmpty()) {

                    /* Ver se há poções no inventário*/
                    for (Consumivel consumivelAtual: heroi.getInventario()) {
                        if (consumivelAtual instanceof Pocao) {
                            pocoes = true;
                            break;
                        }
                    }

                    /* Imprimir as poções */
                    if (pocoes) {
                        System.out.println("\n*** Poções no Inventário ***");

                        ArrayList<Integer> contador = new ArrayList<>();
                        int indice = 0, opcao;
                        for (Consumivel consumivelAtual : heroi.getInventario()) {
                            if (consumivelAtual instanceof Pocao) {
                                System.out.print("\nItem " + indice + ". ");
                                contador.add(indice);
                                consumivelAtual.mostrarDetalhes();
                            }
                            indice++;
                        }

                        System.out.println("\nQueres usar uma poção? sim/nao");
                        escolha = input.next();
                        escolha = escolha.toLowerCase();

                        if (escolha.equals("sim")) {
                            System.out.println("Que Poção queres utilizar?");
                            opcao = input.nextInt();

                            Pocao pocao = (Pocao) heroi.getInventario().get(opcao);

                            /* Se a poção curar pontos de vida a mais */
                            if ((heroi.getVidaAtual() + pocao.getVidaACurar()) > heroi.getVidaMax()) {
                                System.out.println("A poção cura " + pocao.getVidaACurar() + " pontos de vida. Tu tens " + heroi.getVidaAtual() + " pontos de vida. Só podes utilizar " + (heroi.getVidaMax() - heroi.getVidaAtual()) + " da poção.");
                                System.out.println("Queres usar a poção na mesma? sim/nao");
                                String confirmar = input.next();

                                confirmar = confirmar.toLowerCase();

                                if (confirmar.equals("sim")) {
                                    System.out.println("Ganhaste " + pocao.getVidaACurar() + " pontos de vida.");
                                    heroi.setVidaAtual(heroi.getVidaAtual() + pocao.getVidaACurar());
                                    if (heroi.getVidaAtual() > heroi.getVidaMax()) {
                                        heroi.setVidaAtual(heroi.getVidaMax());
                                    }
                                    System.out.println("Ganhaste " + pocao.getAumentoForça() + " pontos de força.");
                                    heroi.setForca(heroi.getForca() + pocao.getAumentoForça());
                                }

                            } else {
                                System.out.println("Ganhaste " + pocao.getVidaACurar() + " pontos de vida.");
                                heroi.setVidaAtual(heroi.getVidaAtual() + pocao.getVidaACurar());
                                System.out.println("Ganhaste " + pocao.getAumentoForça() + " pontos de força.");
                                heroi.setForca(heroi.getForca() + pocao.getAumentoForça());
                            }
                            heroi.getInventario().remove(pocao);
                        }
                    } else {
                        System.out.println("Não tens poções no inventário.");
                    }
                } else {
                    System.out.println("\nNão tens poções no inventário.");
                    break;
                }
            } while (escolha.equals("sim"));
    }

    /**
     * Método para ver se o tipo de heroi pode comprar um determinado item
     * @param heroi heroi que quer comprar o item
     * @param itemHeroi item a ser analisado
     * @return true se for permitido comprar o item, false se não for permitido
     */
    public boolean validarPermissao(Heroi heroi, ItemHeroi itemHeroi){
        for (String heroiPermitidoAtual : itemHeroi.getHeroisPermitidos()){
            if (heroi.getClass().getSimpleName().equals(heroiPermitidoAtual)){
                return true;
            }
        }
       return false;
    }

    /**
     * Método para imprimir a loja do vendedor e comprar itens se o heroi quiser
     * @param vendedor vendedor que possui a loja com os itens
     * @param heroi heroi que compra itens
     * @throws FileNotFoundException se não for encontrado o ficheiro com os itens
     */
    public void loja(Vendedor vendedor, Heroi heroi) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();
        System.out.println("\n*** Itens da Loja ***");

        /* 10 itens aleatórios */
        while (arrayIndexAleatorio.size() < 10) {
            int indexAleatorio = random.nextInt(0, vendedor.getLoja().size());
            if (!arrayIndexAleatorio.contains(indexAleatorio)) {
                arrayIndexAleatorio.add(indexAleatorio);
            }
        }

        /* Imprimir a loja */
        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
            System.out.print("\nItem " + i + ": ");
            vendedor.getLoja().get(arrayIndexAleatorio.get(i)).mostrarDetalhes();
        }

        ArrayList<Integer> itensComprados = new ArrayList<>();
        String opcao;

        do {
            System.out.println("\n\nTem " + heroi.getOuro() + " moedas.");
            System.out.println("Queres comprar um item? sim/nao");
            opcao = input.next();

            opcao = opcao.toLowerCase();
            if (opcao.equals("sim") || opcao.equals("s")) {
                System.out.println("\nQue item queres comprar?");
                int item = input.nextInt();

                for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
                    if (i == item) {
                        ItemHeroi itemHeroi = vendedor.getLoja().get(arrayIndexAleatorio.get(i));
                        if (validarPermissao(heroi, itemHeroi)) {
                            if (heroi.getOuro() >= itemHeroi.getPrecoMoedasOuro()) {
                                if (itemHeroi instanceof ArmaPrincipal) {
                                    ArmaPrincipal armaPrincipal = (ArmaPrincipal) itemHeroi;
                                    heroi.setArmaPrincipal(armaPrincipal);
                                    int index = arrayIndexAleatorio.get(i);;
                                    itensComprados.add(index);
                                } else if (itemHeroi instanceof Consumivel) {
                                    Consumivel consumivel = (Consumivel) itemHeroi;
                                    heroi.getInventario().add(consumivel);
                                    int index = arrayIndexAleatorio.get(i);
                                    itensComprados.add(index);
                                }
                                heroi.setOuro(heroi.getOuro() - itemHeroi.getPrecoMoedasOuro());
                                System.out.println("Removeste o " + itemHeroi.getNome() + " da loja.");
                                break;
                            } else {
                                System.out.println("Não tens ouro suficiente para comprar este item. Escolhe outro item.");
                                loja(vendedor, heroi);
                            }
                        } else {
                            System.out.println("Não podes comprar este item");
                        }
                    }
                }
            } else {
                System.out.println("Nao compraste nada");
            }

        } while (opcao.equals("sim"));

        Collections.sort(itensComprados);
        int contador = 0;

        /* Remover os itens comprados da loja */
        for (int i = 0; i < itensComprados.size(); i++) {
            int index = itensComprados.get(i);
                int numero = index - contador;
                vendedor.removeItem(numero);
            contador++;
        }

    }

    /**
     * Método para o momento no jogo em que o heroi decide se bebe agua ou nao
     * @param heroi heroi que está a jogar
     * @param agua numero da opcao que o jogador escolheu
     */
    public void agua(Heroi heroi, int agua){
        switch (agua){
            case 1:
                heroi.setVidaAtual(heroi.getVidaAtual()-20);
                break;
            case 2:
                heroi.setForca(heroi.getForca()-5);
                break;
        }
    }

    /**
     * Método para o momento no jogo em que o heroi encontra uma pocao
     * @param heroi heroi que está a jogar
     */
    public void encontrarPocao(Heroi heroi){
        Pocao pocao = new Pocao("Poção Encontrada",20,30,5);
        heroi.getInventario().add(pocao);
    }

    /**
     * Método para quando o jogador perde
     * @param escolha numero da opcao que o jogador escolheu
     * @param heroi heroi que está a jogar
     * @throws FileNotFoundException se nao encontrar o ficheiro dos itens
     */
    public void perder(int escolha, Heroi heroi) throws FileNotFoundException {

        switch (escolha){

            /*Escolhe jogar com a mesma personagem*/
            case 1:
                JogoView.buscaPelaSalvacao(heroi);
                break;

            /*Escolhe criar nova personagem*/
            case 2:
                JogoView.buscaPelaSalvacao(JogoView.menuCriarPersonagem());
                break;

            /*Escolhe sair do jogo*/
            case 3:
                System.out.println("Saiu do Jogo.");
                System.exit(0);
                break;
        }
    }

    /**
     * Método para utilizacao da biblioteca random no momento do jogo em que o jogador encontra um barqueiro
     * @return quantidade de moedas de ouro que tem de pagar
     */
    public int barqueiroOuro(){
        Random random = new Random();
        int ouro = random.nextInt(5,30);
        return ouro;
    }



}






