package Exercicio01;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat", "500", 2022, 200, 100, tipoCombustivel.Gasolina, 4.5);
        Carro carro2 = new Carro("Mini", "Cooper", 2008, 200, 100, tipoCombustivel.Diesel, 5.5);
        Carro carro3 = new Carro("Volkswagen", "T-Rock", 2015, 250, 120, tipoCombustivel.Gasolina, 6);
        Carro carro4 = new Carro("Audi", "A8", 2005, 200, 100, tipoCombustivel.Diesel, 5);

        carro1.ligar();
        carro2.ligar();

        Carro vencedor1 = carro1.corrida(carro2);
        Carro vencedor2 = carro3.corrida(carro4);
        Carro vencedorFinal = vencedor1.corrida(vencedor2);

        System.out.println(" ");
        if (vencedor1 != null) {
            System.out.println("Vencedor 1: " + vencedor1.getMarca() + " " + vencedor1.getModelo());
        } else {
            System.out.println("Empate");
        }

        System.out.println(" ");
        if (vencedor2 != null) {
            System.out.println("Vencedor 2: " + vencedor2.getMarca() + " " + vencedor2.getModelo());
        } else {
            System.out.println("Empate");
        }

        System.out.println(" ");
        if (vencedorFinal != null) {
            System.out.println("Vencedor Final: " + vencedorFinal.getMarca() + " " + vencedorFinal.getModelo());
        } else {
            System.out.println("Empate");
        }

        double consumoCarro1 = carro1.consumoCombustivel(97);
        double consumoCarro2 = carro2.consumoCombustivel(97);

        System.out.println("");
        System.out.println("O " + carro1.getMarca() + " iria consumir " + consumoCarro1 + " litros de combustivel.");
        System.out.println("O " + carro2.getMarca() + " iria consumir " + consumoCarro2 + " litros de combustivel.");

        if (consumoCarro1 > consumoCarro2) {
            System.out.println("O carro que gasta mais é o " + carro1.getMarca());
        } else {
            System.out.println("O carro que gasta mais é o " + carro2.getMarca());
        }

    }
}
