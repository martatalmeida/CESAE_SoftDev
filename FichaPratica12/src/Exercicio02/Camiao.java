package Exercicio02;

public class Camiao extends Veiculo{

    private double capacidadeCargaKg;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km, double capacidadeCargaKg) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }



    public void viagem(double distancia, double carga){
        if(capacidadeCargaKg < carga){
            System.out.println("O camião não tem capacidade para a carga.");
        } else{
            double aumento = carga / 100;
            double consumo = (this.getLitros100km()+(aumento/10)) * (distancia/100);
            double custo = consumo * 1.95;
            System.out.println("Consumo da viagem de Camião: " + consumo + " litros.");
            System.out.println("Custo da viagem de Camião: " + custo + " euros.");
        }
    }

}
