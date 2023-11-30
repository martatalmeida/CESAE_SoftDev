package InstitutoVidaMundial;

public class SerVivo {

    private String nome;
    private String especie;
    private String pais;
    private int idade;

    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    public void listarInformacoes(){
        System.out.println("\nNome: " + this.nome + "\nEspecie: " + this.especie + "\nPaís: " + this.pais + "\nIdade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }
}
