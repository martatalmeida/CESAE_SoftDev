package Exercicio02;

public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Marta", 22, 934023042, "marta@gmail.com");
        Pessoa pessoa2 = new Pessoa("Rita", 16, 942739560, "rita@gmail.com");
        Pessoa pessoa3 = new Pessoa("Vasco", 30, 936748163, "vasco@gmail.com");
        Pessoa pessoa4 = new Pessoa("Isabel", 62, 912639574, "isabel@gmail.com");
        Pessoa pessoa5 = new Pessoa("Mario", 63, 935285017, "mario@gmail.com");

        Sorteio sorteio = new Sorteio();

        sorteio.adicionarParticipante(pessoa1);
        sorteio.adicionarParticipante(pessoa2);
        sorteio.adicionarParticipante(pessoa3);
        sorteio.adicionarParticipante(pessoa4);
        sorteio.adicionarParticipante(pessoa5);

        sorteio.listaParticipantes();

        Pessoa vencedor = sorteio.sortear();
        System.out.print("\nVencedor: " + vencedor.getNome());

    }
}
