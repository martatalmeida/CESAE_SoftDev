package Exercicio11;

public class Conta {

    private int numeroConta;
    private double saldo;
    private String titularConta;

    public Conta(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public void transferencia(double valor, Conta contaDestinatario){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            contaDestinatario.saldo = contaDestinatario.saldo + valor;
            System.out.println("A transferência foi bem sucedida.");
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Foram depositados " + valor + ". O saldo foi atualizado: " + this.saldo);
    }

    public void levantar(double valor) {
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Levantou " + valor + ". O saldo foi atualizado: " + this.saldo);
        } else {
            System.out.println("Não é possível realizar a operação.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numeroConta + ": " + this.saldo);
    }

}
