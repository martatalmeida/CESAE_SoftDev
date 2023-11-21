package Exercicio06;

public class Competicao {

    private String nomeCompeticao;
    private String pais;
    private Atleta[] listaAtletas;

    public Competicao(String nomeCompeticao, String pais) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        listaAtletas = new Atleta[6];
    }

    public void adicionarAtleta(Atleta atleta){
        for (int i = 0; i < listaAtletas.length; i++){
            if (this.listaAtletas[i] == null){
                this.listaAtletas[i] = atleta;
                return;
            }
        }
    }

    public void informacoesCompeticao(){
        System.out.println("Nome da Competição: " + this.nomeCompeticao);
        System.out.println("País: " + this.pais);
        System.out.println("");
        System.out.println("Atletas:\n");
        for (int i = 0; i < listaAtletas.length; i++){
            if (this.listaAtletas[i] != null){
                listaAtletas[i].detalhesAtletas();
                System.out.println("");
            }
        }
        System.out.println("");
    }

}
