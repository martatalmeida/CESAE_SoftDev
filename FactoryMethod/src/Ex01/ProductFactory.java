package Ex01;

public class ProductFactory {

    public static Product criarProduto(String tipoProduto, String nome, double preco){
        tipoProduto=tipoProduto.toLowerCase();
        switch (tipoProduto){
            case "livro":
                return new Book(nome, preco);
            case "eletronico":
                return new Electronics(nome, preco);
            case "roupa":
                return new Clothing(nome, preco);
            default:
                throw new IllegalArgumentException("Tipo de produto inválido" + tipoProduto);
        }
    }

}
