package Exercicio02;

public class Conta {

    private int numeroConta;
    private double saldo;
    private String titularConta;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double valorDivida;

    public Conta(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public boolean pedirEmprestimo(double valor){
        if (this.valorDivida == 0) {
            if (this.saldo * margemEmprestimo >= valor) {
                this.saldo += valor;
                this.valorDivida = valor;
                return true;
            } else {
                System.out.println("A margem de emprestimo não é suficiente");
                return false;
            }
        } else {
            System.out.println("O pedido não pode ser realizado porque já tem divida");
        }
       return false;
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



