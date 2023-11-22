package AirplaneStore;

public class Aviao {

    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double comprimentoFuselagem;
    private double envergaduraAsas;
    private double alturaCauda;
    private int numMotores;
    private double autonomia;
    private double velocidadeMax;
    private double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPreco() {
        return preco;
    }

    public void listarDetalhesAviao(){
        System.out.println("Nº Série: " + this.numSerie + "\nModelo: " + this.modelo + "\nAno de Fabrico: " + this.anoFabrico + "\nPeso: " + this.peso + "\nComprimento Fuselagem: " + this.comprimentoFuselagem + "\nEnvergadura Asas: " + this.envergaduraAsas + "\nAltura Cauda: " + this.alturaCauda + "\nNº Motores: " + this.numMotores + "\nAutonomia: " + this.autonomia + "\nVelocidade Max: " + this.velocidadeMax + "\nPreço: " + this.preco);
    }

}
