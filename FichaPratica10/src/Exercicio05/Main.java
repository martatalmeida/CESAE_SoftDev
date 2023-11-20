package Exercicio05;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Marta", 22, "martaalmeida@gmail.com", 917317624);
        Pessoa pessoa2 = new Pessoa("Isabel", 60, "isabel@gmail.com", 914029747);

        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarPessoa(pessoa1);
        minhaAgenda.adicionarPessoa(pessoa2);

        minhaAgenda.listarPessoas();

    }

}
