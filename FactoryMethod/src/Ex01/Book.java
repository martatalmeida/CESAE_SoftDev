package Ex01;

public class Book extends Product{

    public Book(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Livro: " + super.getNome());
    }
}
