package Exercicio03.Entidades;

import Exercicio03.Curso;

public class Aluno extends Pessoa {

    private Curso curso;
    private double mediaNotas;
    private String[][] pauta;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso) {
        super(nome, anoNascimento, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = new String[10][2];
    }


    @Override
    public void obterFuncao() {
        System.out.println( "Aluno");
    }

    @Override
    public void imprimirHorario() {

    }
}
