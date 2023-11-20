package Exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private tipoCombustivel tipoCombustivel;
    private double litros100km;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Exercicio01.tipoCombustivel tipoCombustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100km = litros100km;
    }

    public void ligar() {
        int idade = 2023 - this.anoFabrico;
        if (idade > 30) {
            if (this.tipoCombustivel.equals(Exercicio01.tipoCombustivel.Diesel)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }
        if (idade <= 30) {
            if (potencia < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMM");
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro corrida(Carro adversario) {
        if (this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;
        } else if (this.potencia == adversario.potencia) {
            if (this.cilindrada > adversario.cilindrada) {
                return this;
            } else if (adversario.cilindrada > this.cilindrada) {
                return adversario;
            } else if (this.cilindrada == adversario.cilindrada) {
                if(this.anoFabrico > adversario.anoFabrico) {
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    return adversario;
                }
            }
        }
        return null;
    }

    public double consumoCombustivel(double distancia) {
        double valorConsumo = this.litros100km * distancia;
        return valorConsumo;
    }

}
