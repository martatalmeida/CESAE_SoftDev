package Exercicio02;

public class Main {

    public static void main(String[] args) {

        Cao fido = new Cao("Fido", "Pastor Alemão");
        Cao bobby = new Cao ("Bobby", "Golden Retriever");
        Cao spot = new Cao ("Spot", "Salsicha");

        fido.ladrar();

        fido.setLatido("Woof Woof");
        bobby.setLatido("Woof");
        spot.setLatido("Auuu");

        fido.ladrar();
        bobby.ladrar();
        spot.ladrar();


    }

}
