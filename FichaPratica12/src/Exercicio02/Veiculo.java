package Exercicio02;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private static TipoCombustivel tipoCombustivel;
    private double litros100km;


    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km) {
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
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
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

    public static TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getLitros100km() {
        return litros100km;
    }

    public Veiculo corrida(Veiculo adversario) {
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
        double valorConsumo = this.litros100km * (distancia/100);
        return valorConsumo;
    }

}
