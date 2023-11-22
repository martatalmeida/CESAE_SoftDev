package AirplaneStore;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCauda, numMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    public void inserirArma(Armas arma){
        if (armas.size() < 3) {
            armas.add(arma);
        } else {
            System.out.println("Não pode adicionar mais de 3 armas.");
        }
    }

    public void removerArma(Armas arma){
        armas.remove(arma);
    }


    public void listarArmas(){
        System.out.print("Armas: ");
        for (int i = 0; i < armas.size(); i++){
            System.out.print(this.armas.get(i) + " | ");
        }
    }

    public void listarDetalhesCombate(){
        System.out.println("País Origem: " + this.paisOrigem + "\nCamuflagem: " + this.camuflagem);
    }


}
