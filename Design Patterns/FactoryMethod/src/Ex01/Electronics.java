package Ex01;

public class Electronics extends Product{

    public Electronics(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Eletronico: " + super.getNome());
    }


}
