package Exercicio03.Entidades;

import Exercicio03.Entidades.Pessoa;
import Exercicio03.Enums.Funcao;

public class Funcionario extends Pessoa {

    private Funcao funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, Funcao funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }


    @Override
    public void obterFuncao() {
        System.out.println(this.funcao);
    }

    @Override
    public void imprimirHorario() {
        System.out.println("8h a " + this.funcao);
    }
}
