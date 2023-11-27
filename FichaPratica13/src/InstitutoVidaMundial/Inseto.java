package InstitutoVidaMundial;

public class Inseto extends SerVivo{

    private boolean venenoso;

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void listarDetalhes(){
        System.out.println("Venenoso: " + this.venenoso);
    }
}
