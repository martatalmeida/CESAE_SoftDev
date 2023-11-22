package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao aviao){
        catalogo.add(aviao);
    }

    public void venderAviao(Aviao aviao){
        catalogo.remove(aviao);
    }

    public void listarCatalogo(){
        System.out.println("\nCatálogo:\n");
        for (int i = 0; i < catalogo.size(); i++){
            Aviao aviaoAtual = this.catalogo.get(i);

            if(aviaoAtual instanceof JatoPrivado){
                JatoPrivado jatoAtual = (JatoPrivado) aviaoAtual;
                jatoAtual.listarDetalhesAviao();
                jatoAtual.listarDetalhesJato();
                jatoAtual.listarInstalacoes();
                System.out.println("\n*****");
            }
            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate combateAtual = (AviaoCombate) aviaoAtual;
                combateAtual.listarDetalhesAviao();
                combateAtual.listarDetalhesCombate();
                combateAtual.listarArmas();
                System.out.println("\n*****");
            }
        }
    }

    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < catalogo.size(); i++){
            total += catalogo.get(i).getPreco();
        }
        return total;
    }

}
