package Exercicio03.Entidades;

import Exercicio03.Disciplina;
import Exercicio03.Entidades.Aluno;
import Exercicio03.Entidades.Pessoa;
import Exercicio03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private ArrayList<AreaFormacao> areasFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.areasFormacao = new ArrayList<AreaFormacao>();
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void obterFuncao() {
        System.out.println( "Professor");
    }

    @Override
    public void imprimirHorario() {

    }

    public ArrayList<AreaFormacao> getAreasFormacao() {
        return areasFormacao;
    }

    public int getNivelAcademico() {
        return nivelAcademico;
    }



    public void exibirDetalhesMinimos(){
        System.out.println(super.getNome() + "\t| Nível Academico: " + this.nivelAcademico);
    }


}
