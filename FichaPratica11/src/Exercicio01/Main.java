package Exercicio01;

public class Main {

    public static void main(String[] args) {

        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 2600);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Pimba", "Quim Barreiros", 233);
        Musica musica4 = new Musica("As It Was", "Pop", "Harry Styles", 600);
        Musica musica5 = new Musica("You Belong With Me", "Pop", "Taylor Swift", 480);
        Musica musica6 = new Musica("Fix You", "Pop", "Coldplay", 580);

        MusicPlayer programacao = new MusicPlayer();

        programacao.adicionarMusicas(musica1);
        programacao.adicionarMusicas(musica2);
        programacao.adicionarMusicas(musica3);
        programacao.adicionarMusicas(musica4);
        programacao.adicionarMusicas(musica5);
        programacao.adicionarMusicas(musica6);

        programacao.imprimirRelatorio();

        programacao.trocarMusicas(0,musica6);
        programacao.trocarMusicas(5,musica1);

        programacao.removerMusicas(3);

        programacao.imprimirRelatorio();

        programacao.duracao();

        programacao.removerTodasMusicas();

        programacao.duracao();


    }

}
