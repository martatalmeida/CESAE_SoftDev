package AirplaneStore;

import java.util.ArrayList;

public class JatoPrivado extends Aviao{

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;

    private ArrayList<Instalacoes> instalacoes;

    public JatoPrivado(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCauda, numMotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacoes>();
    }

    public void inserirInstalacao(Instalacoes instalacao){
            instalacoes.add(instalacao);
        }

    public void removerInstalacao(Instalacoes instalacao){
        instalacoes.remove(instalacao);
    }


    public void listarInstalacoes(){
        System.out.print("Instalações: ");
        for (int i = 0; i < instalacoes.size(); i++){
            System.out.print(instalacoes.get(i) + " | ");
        }
    }

    public void listarDetalhesJato(){
        System.out.println("Lotação: " + this.lotacao + "\nCapacidade Bagagem: " + this.capacidadeBagagem + "\nCategoria: " + this.categoria);
    }





}
