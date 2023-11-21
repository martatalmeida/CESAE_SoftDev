package Exercicio02;

import java.util.Random;
import java.util.ArrayList;

public class Sorteio {

    private double premio;
    private ArrayList<Pessoa> participantes;

    Sorteio() {
        participantes = new ArrayList<Pessoa>();
    }

    public void adicionarParticipante(Pessoa pessoa){
        if(pessoa.getIdade() >= 18) {
            participantes.add(pessoa);
        } else {
            System.out.println("A " + pessoa.getNome() + " é menor de idade por isso não pode participar.");
        }
    }

    public Pessoa sortear(){
        Random random = new Random();
        int sorteio = random.nextInt(0,participantes.size()-1);
        return participantes.get(sorteio);
    }

    public void listaParticipantes(){
        for (int i = 0; i < participantes.size(); i++){
            System.out.print("\nParticipante: ");
            participantes.get(i).detalhesPessoa();
        }
    }

}
