package Exercicio03;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Archie", "Gato", "Portugal", 5, new String[]{"Atum", "Salmao", "Fiambre", "Leite"});

        animal1.animalComer("Atum", 300);

        System.out.println("Peso: " + animal1.getPeso());

        animal1.animalComer("Frango", 300);

        System.out.println("Peso: " + animal1.getPeso());

    }

}
