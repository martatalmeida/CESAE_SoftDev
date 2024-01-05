package Ex01;

public class Clothing extends Product{

    public Clothing(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("produto Categoria Roupa: " + super.getNome());
    }
}
