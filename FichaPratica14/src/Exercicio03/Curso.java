package Exercicio03;

import Exercicio03.Entidades.Professor;
import Exercicio03.Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso{

    private String nome;
    private ArrayList<DisciplinaCurso> planoCurricular;
    private boolean longaDuracao;

    public Curso(Escola escola) {

        this.planoCurricular = new ArrayList<DisciplinaCurso>();

        Scanner input = new Scanner(System.in);

        String nome;
        int numDisciplinas;
        int codigoDisciplina;
        int codProfessor;


        System.out.println("Nome do curso: ");
        nome = input.nextLine();
        this.nome = nome;

        System.out.println("Quantidade disciplinas: ");
        numDisciplinas = input.nextInt();

        for (int i = 0; i < numDisciplinas; i++) {
            escola.imprimirDisciplinas();
            System.out.println("Código Disciplinas: ");
            codigoDisciplina = input.nextInt();
            codigoDisciplina--;

            Disciplina disciplina = escola.getListaDisciplinas().get(codigoDisciplina);

            ArrayList<Professor> professoresCompetentes = new ArrayList<>();

            for (Professor professorAtual : escola.getListaProfessores()) {
                for (AreaFormacao areaFormacaoAtual : professorAtual.getAreasFormacao()) {
                    if (areaFormacaoAtual.equals(disciplina.getArea())) {
                        professoresCompetentes.add(professorAtual);
                    }
                }
            }
            System.out.println("Professores Competentes: ");
            int contador = 1;
            for (Professor professorAtual : professoresCompetentes) {
                System.out.println(contador + ": ");
                professorAtual.exibirDetalhesMinimos();
            }
            System.out.println("Código Professor: ");
            codProfessor = input.nextInt();
            codProfessor--;

            Professor professor = professoresCompetentes.get(codProfessor);

            DisciplinaCurso disciplinaCurso = new DisciplinaCurso(disciplina, professor);
            this.planoCurricular.add(disciplinaCurso);
        }
    }

        public int calcularDuracao(){
            int duracaoTotal = 0;

            for (DisciplinaCurso disciplinaCursoAtual : this.planoCurricular){
                duracaoTotal += disciplinaCursoAtual.getDisciplina().getDuracaoHoras();
            }
        }


}
