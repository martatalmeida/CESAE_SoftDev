package Exercicio05;

public class Agenda {

    private Pessoa[] agenda;

    public Agenda() {
        agenda = new Pessoa[10];
    }

    public void adicionarPessoa(Pessoa pessoa) {
        for (int i = 0; i < agenda.length; i++) {
            if (this.agenda[i] == null) {
                this.agenda[i] = pessoa;
                return;
            }
        }
    }

    public void listarPessoas() {
        for (int i = 0; i < agenda.length; i++) {
            if (this.agenda[i] != null) {
                this.agenda[i].exibirDetalhes();
                System.out.println("");
            }
        }
    }

}
