package Exercicio09;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("lápis", 1.5, 20);

        produto1.comprar(5);

        produto1.vender(2);

        produto1.comprar(10);

        produto1.vender(35);

    }

}
