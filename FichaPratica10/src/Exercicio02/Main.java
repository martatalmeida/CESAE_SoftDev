package Exercicio02;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(1, 300, "Marta");
        Conta conta2 = new Conta(2, 500, "Isabel");
        Conta conta3 = new Conta(3, 200, "Mario");


        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta1.levantar(120);

        System.out.println(" ");
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();
        conta2.transferencia(400, conta3);

        System.out.println(" ");
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println("");

        if (conta1.pedirEmprestimo(500)) {
            System.out.println("O pedido de emprestimo foi aceite");
            System.out.println("Saldo atualizado. ");
            conta1.mostrarSaldo();
        } else {
            System.out.println("Não pode pedir o emprestimo.");
        }


}


}
