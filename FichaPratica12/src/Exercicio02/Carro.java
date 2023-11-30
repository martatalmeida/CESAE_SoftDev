package Exercicio02;

public class Carro extends Veiculo{

    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
        this.quantPassageiros = quantPassageiros;
    }

    public double calcularCusto(double distancia){

        TipoCombustivel tipoCombustivel = Carro.getTipoCombustivel();
        double consumo = consumoCombustivel(distancia);
        double custoTotal=0;

        switch (tipoCombustivel){
            case GASOLINA -> custoTotal= consumo * 2.10;
            case DIESEL -> custoTotal=consumo *1.95;
            case GPL -> custoTotal=consumo * 1.15;
            case ELETRICO -> custoTotal=consumo *0.12;
        }
        return custoTotal;
    }


}
