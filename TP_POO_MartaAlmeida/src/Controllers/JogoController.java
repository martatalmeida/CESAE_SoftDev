package Controllers;

import Domain.ItensHeroi.*;
import Domain.Personagem.*;
import Domain.Vendedor;
import Repository.ItensRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoController {


    public JogoController() {

    }

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
                return new Humano(nome, vida, forca, 1, ouro);
            case 3:
                return new Elfo(nome, vida, forca, 1, ouro);
        }
        return null;
    }


    public Entidade atacar(Heroi heroi, NPC npc) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        Entidade vencedor = null;
        do {
            System.out.println("1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Consumível");
            System.out.println("Que ataque quer usar?");
            int ataque = input.nextInt();

            switch (ataque) {
                case 1:
                    if (heroi instanceof Feiticeiro) {
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                        heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                    }
                    if (heroi instanceof Humano) {
                        heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                    }
                    if (heroi instanceof Elfo) {
                        npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaque()));
                        heroi.setVidaAtual((int) (heroi.getVidaAtual() - (npc.getForca() - (npc.getForca() * 0.2))));
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        if (heroi instanceof Feiticeiro) {
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                            contador++;
                        }
                        if (heroi instanceof Humano) {
                            heroi.setVidaAtual(heroi.getVidaAtual() - (npc.getForca()));
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            contador++;
                        }
                        if (heroi instanceof Elfo) {
                            npc.setVidaAtual(npc.getVidaAtual() - (heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial()));
                            heroi.setVidaAtual((int) (heroi.getVidaAtual() - (npc.getForca() - (npc.getForca() * 0.2))));
                            contador++;
                        }
                    } else {
                        System.out.println("Já usaste o Ataque Especial nesta luta.");
                    }
                    break;
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
                        System.out.println("Que Ataque Consumível quer utilizar? Digite 0 se quiser cancelar este ataque");
                        ataqueConsumivel = input.nextInt();
                        if (ataqueConsumivel != 0) {
                            ConsumivelCombate consumivelCombate = (ConsumivelCombate) heroi.getInventario().get(ataqueConsumivel);
                            npc.setVidaAtual(npc.getVidaAtual() - consumivelCombate.getAtaqueInstantaneo());
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
            heroi.setVidaAtual(heroi.getVidaAtual() + 10);
            heroi.setForca(heroi.getForca() + 1);
            heroi.setOuro(heroi.getOuro() + npc.getOuro());
        }
        return vencedor;
    }


    public void usarPocao(Heroi heroi) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> contador = new ArrayList<>();
        int indice = 0, opcao;
        for (Consumivel consumivelAtual : heroi.getInventario()) {
            if (consumivelAtual instanceof Pocao) {
                System.out.println(indice + ". ");
                contador.add(indice);
                consumivelAtual.mostrarDetalhes();
            }
            indice++;
        }

        do {
            System.out.println("Que Poção quer utilizar?");
            opcao = input.nextInt();
        } while (!contador.contains(opcao));

        Pocao pocao = (Pocao) heroi.getInventario().get(opcao);

        heroi.setVidaAtual(heroi.getVidaAtual() + pocao.getVidaACurar());
        heroi.setForca(heroi.getForca() + pocao.getAumentoForça());

        heroi.getInventario().remove(pocao);
    }

    public boolean validarPermissao(Heroi heroi, ItemHeroi itemHeroi){
        for (String heroiPermitidoAtual : itemHeroi.getHeroisPermitidos()){
            if (heroi.getClass().getSimpleName().equals(heroiPermitidoAtual)){
                return true;
            }
        }
       return false;
    }

    public void loja(Vendedor vendedor, Heroi heroi) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();
        while (arrayIndexAleatorio.size() < 10) {
            int indexAleatorio = random.nextInt(0, vendedor.getLoja().size());
            if (!arrayIndexAleatorio.contains(indexAleatorio)) {
                arrayIndexAleatorio.add(indexAleatorio);
            }
        }
        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
            System.out.print("\nItem " + i + ": ");
            vendedor.getLoja().get(arrayIndexAleatorio.get(i)).mostrarDetalhes();
        }

        System.out.println("\n\nQuer comprar um item? sim/nao");
        String opcao = input.next();

        opcao.toLowerCase();
        if(opcao.equals("sim") || opcao.equals("s")) {
            System.out.println("\nQue item quer comprar?");
            int item = input.nextInt();

            for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
                if (i == item) {
                    ItemHeroi itemHeroi = vendedor.getLoja().get(arrayIndexAleatorio.get(item));
                        if (validarPermissao(heroi, itemHeroi)) {
                            if (heroi.getOuro() >= itemHeroi.getPrecoMoedasOuro()) {
                                if (itemHeroi instanceof ArmaPrincipal) {
                                    ArmaPrincipal armaPrincipal = (ArmaPrincipal) itemHeroi;
                                    heroi.setArmaPrincipal(armaPrincipal);
                                    vendedor.getLoja().remove(armaPrincipal);
                                } else if (itemHeroi instanceof Consumivel) {
                                    Consumivel consumivel = (Consumivel) itemHeroi;
                                    heroi.getInventario().add(consumivel);
                                    vendedor.getLoja().remove(consumivel);
                                }
                                heroi.setOuro(heroi.getOuro()-itemHeroi.getPrecoMoedasOuro());
                                System.out.println("Removeu o " + itemHeroi.getNome());
                            } else {
                                System.out.println("Não tem ouro suficiente para comprar este item. Escolha outro item.");
                                loja(vendedor,heroi);
                            }
                        }else {
                            System.out.println("Não pode comprar este item");
                        }
                    }
                }
            } else {
            System.out.println("Nao comprou nada");
            return;
        }
    }

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

}






