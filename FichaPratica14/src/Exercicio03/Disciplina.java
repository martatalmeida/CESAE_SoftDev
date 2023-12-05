package Exercicio03;

import Exercicio03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {

    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public Disciplina() {
        Scanner input = new Scanner(System.in);
        String nome;
        AreaFormacao area = null;
        int duracaoHoras, indexArea;

        System.out.println("Nome Disciplina: ");
        nome = input.nextLine();

        int contador=1;
        for (AreaFormacao areaFormacaoAtual : AreaFormacao.values()){
            System.out.println(contador++ + ": " + areaFormacaoAtual);
        }

        System.out.println("\nÁrea: ");
        indexArea = input.nextInt();

        contador = 1;
        for (AreaFormacao areaFormacaoAtual : AreaFormacao.values()){
            if (indexArea == contador) {
                area = areaFormacaoAtual;
            }
            contador++;
        }

        System.out.println("Área escolhida: " + area);

        System.out.println("Duraçao Horas: ");
        duracaoHoras = input.nextInt();

        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public String getNome() {
        return nome;
    }

    public AreaFormacao getArea() {
        return area;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Área Formação: " + this.area);
        System.out.println("Duraçao Horas: " + this.duracaoHoras + "h");
    }
}
