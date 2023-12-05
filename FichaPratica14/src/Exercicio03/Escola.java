package Exercicio03;

import Exercicio03.Entidades.Aluno;
import Exercicio03.Entidades.Funcionario;
import Exercicio03.Entidades.Professor;
import Exercicio03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Escola {

    private String nome;
    private String localizacao;
    private int lotacaoMaxAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaStaff;

    public Escola(String nome, String localizacao, int lotacaoMaxAlunos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxAlunos = lotacaoMaxAlunos;
        this.listaProfessores = new ArrayList<Professor>();
        this.listaDisciplinas = new ArrayList<Disciplina>();
        this.listaCursos = new ArrayList<Curso>();
        this.listaAlunos = new ArrayList<Aluno>();
        this.listaStaff = new ArrayList<Funcionario>();
    }

    public void adicionarProfessor(Professor professor){
        this.listaProfessores.add(professor);
    }

    public void adicionarCurso(Curso curso){
        this.listaCursos.add(curso);
    }

    public void adicionarDisciplina(Disciplina disciplina){
        this.listaDisciplinas.add(disciplina);
    }

    public void adicionarAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }

    public void adicionarFuncionario (Funcionario funcionario){
        this.listaStaff.add(funcionario);
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public ArrayList<Funcionario> getListaStaff() {
        return listaStaff;
    }

    public void imprimirDisciplinas(){
        int contador = 1;
        System.out.println("** Disciplinas **");
        for (Disciplina disciplinaAtual : this.listaDisciplinas){
            System.out.print(contador++ + ": ");
            disciplinaAtual.exibirDetalhes();
        }
        System.out.println("");
    }

    public void imprimirProfessoresCompetentes (AreaFormacao areaFormacao){
        int contador = 1;
        System.out.println("** Professores Competentes **");
        for (Professor professorAtual : this.listaProfessores){

        }
    }
}
