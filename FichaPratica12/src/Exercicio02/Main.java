package Exercicio02;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Carro fiat = new Carro("Fiat", "500", 2022, 200, 100, TipoCombustivel.GASOLINA, 4.5,4);
        Carro mini = new Carro("Mini", "Cooper", 2008, 200, 100, TipoCombustivel.DIESEL, 5.5,4);
        Mota mota1 = new Mota("Volkswagen", "M-3", 2015, 250, 120, TipoCombustivel.GASOLINA, 6);
        Camiao camiao1 = new Camiao("Audi", "C8", 2005, 200, 100, 5,500);


        Veiculo vencedor1 = fiat.corrida(mini);

        System.out.println(" ");
        if (vencedor1 != null) {
            System.out.println("Vencedor da corrida de carros: " + vencedor1.getMarca() + " " + vencedor1.getModelo());
        } else {
            System.out.println("Empate");
        }

        Veiculo vencedor2 = mota1.corrida(camiao1);

        System.out.println("");
        if(vencedor2 != null){
            System.out.println("Vencedor da corrida entre mota e camião: " + vencedor2.getMarca() + " " + vencedor2.getModelo());
        } else{
            System.out.println("Empate");
        }


        double custoViagemCarro = fiat.calcularCusto(150);
        System.out.println("\nCusto Total da Viagem de Carro: " + custoViagemCarro + "euros");

        mota1.imagem();

        camiao1.viagem(150,300);
        camiao1.viagem(150, 600);

    }
}