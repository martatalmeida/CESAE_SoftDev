package Exercicio03;

public class Main {

    public static void main(String[] args) {

        Peixe atum = new Peixe("Atum", 2.5, 4);
        Peixe salmao = new Peixe("Salmão", 11, 5);
        Peixe pescada = new Peixe("Pescada", 3, 4);

        Marisco camarao = new Marisco("Camarao", 5, 5);
        Marisco ameijoas = new Marisco("Ameijoas", 6, 6);

        BarcoPesca barco1 = new BarcoPesca("Pescador", "Verde", "2020", 10, 15, Marca.Quicksilver);

        barco1.pescarPeixe(atum);
        barco1.pescarPeixe(salmao);
        barco1.pescarPeixe(pescada);
        barco1.verificarCarga(camarao.getPeso()+ ameijoas.getPeso());
        barco1.pescarMarisco(camarao);
        barco1.pescarMarisco(ameijoas);

        double valor = barco1.calcularTotal();
        System.out.println("O valor total são " + valor + " euros");

        double salario = barco1.salarioTripulacao();
        System.out.println("O salário da tripulação são " + salario + " euros,");


    }

}
