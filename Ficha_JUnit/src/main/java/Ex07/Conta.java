package Ex07;

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

    public double getSaldo() {
        return saldo;
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

    public boolean transferencia(double valor, Conta contaDestinatario){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            contaDestinatario.saldo = contaDestinatario.saldo + valor;
            System.out.println("A transferência foi bem sucedida.");
            return true;
        }
        return false;
    }

    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Foram depositados " + valor + ". O saldo foi atualizado: " + this.saldo);
        return this.saldo;
    }

    public boolean levantar(double valor) {
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Levantou " + valor + ". O saldo foi atualizado: " + this.saldo);
            return true;
        } else {
            System.out.println("Não é possível realizar a operação.");
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numeroConta + ": " + this.saldo);
    }

}
