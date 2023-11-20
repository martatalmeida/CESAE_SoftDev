package Exercicio08;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Marta", 22, "SoftDev", 16);

        String situacaoAluno;

        situacaoAluno = aluno1.situacao();
        System.out.println(situacaoAluno);

    }

}
