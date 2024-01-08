package Ex05;

public class Funcionario {

        private String nome;
        private double salario;
        private String departamento;

        public Funcionario(String nome, double salario, String departamento) {
            this.nome = nome;
            this.salario = salario;
            this.departamento = departamento;
        }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double aumentarSalario(double valor){
            System.out.println("O salário foi aumentado. Salário: " + this.salario);
            return this.salario = this.salario + (this.salario*valor);
        }

        public void exibirDados(){
            System.out.println("Dados do Funcionário:");
            System.out.println("Nome: " + this.nome);
            System.out.println("Salario: " + this.salario);
            System.out.println("Departamento: " + this.departamento);
        }

}
