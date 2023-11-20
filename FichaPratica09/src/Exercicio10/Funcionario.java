package Exercicio10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double valor){
        this.salario = this.salario + (this.salario*valor);
        System.out.println("O salário foi aumentado. Salário: " + this.salario);
    }

    public void exibirDados(){
        System.out.println("Dados do Funcionário:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }

}
