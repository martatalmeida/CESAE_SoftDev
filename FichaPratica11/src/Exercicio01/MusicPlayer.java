package Exercicio01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer(){
        programacao = new ArrayList<Musica>();
    }

    public void adicionarMusicas(Musica musica){
        programacao.add(musica);
    }

    public void trocarMusicas(int index, Musica musica){
        programacao.set(index, musica);
    }

    public void removerMusicas(int index){
        programacao.remove(index);
    }

    public void removerTodasMusicas(){
        programacao.clear();
    }

    public void imprimirRelatorio(){
        for (int i = 0; i < programacao.size(); i++){
            System.out.print("Música: ");
            programacao.get(i).detalhesMusica();
        }
        System.out.println("");
    }

    public void duracao(){
        int somaSegundos = 0;
        int segundos, minutos, horas;
        for (int i = 0; i < programacao.size(); i++){
            somaSegundos += programacao.get(i).getDuracao();
        }

        minutos = somaSegundos/60;
        horas = minutos / 60;
        minutos %= 60;
        segundos = somaSegundos%60;
        System.out.println("Duração da programaçao: " + horas + ":" + minutos + ":" + segundos);





    }

}
