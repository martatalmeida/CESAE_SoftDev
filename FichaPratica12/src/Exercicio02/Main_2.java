package Exercicio02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_2 {

    public static Veiculo criarVeiculo(){
        Scanner input = new Scanner(System.in);
        String veiculo;
        System.out.println("Que veículo quer criar? Mota, Carro, Camião");
        veiculo = input.next();

        String marca, modelo, combustivel;
        int anoFabrico, potencia, cilindrada;
        double litros100Km;
        TipoCombustivel tipoCombustivel = null;

        System.out.println("Diga a marca: ");
        input.next();
        marca = input.nextLine();
        System.out.println("Diga o modelo: ");
        modelo = input.nextLine();
        System.out.println("Ano de Fabrico: ");
        anoFabrico = input.nextInt();
        System.out.println("Potencia: ");
        potencia = input.nextInt();
        System.out.println("Cilindrada: ");
        cilindrada = input.nextInt();
        System.out.println("Litros por 100Km: ");
        litros100Km = input.nextDouble();


        switch (veiculo){
            case "carro":
                int quantpassageiros;
                System.out.println("Tipo Combustivel: ");
                combustivel = input.next();
                switch (combustivel){
                    case "gasolina":
                        tipoCombustivel = TipoCombustivel.GASOLINA;
                        break;
                    case "diesel":
                        tipoCombustivel = TipoCombustivel.DIESEL;
                        break;
                    case "gpl":
                        tipoCombustivel = TipoCombustivel.GPL;
                        break;
                    case "eletrico":
                        tipoCombustivel = TipoCombustivel.ELETRICO;
                        break;
                }
                System.out.println("Quantidade Passageiros: ");
                quantpassageiros = input.nextInt();
                return new Carro(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100Km, quantpassageiros);
            case "mota":
                System.out.println("Tipo Combustivel: ");
                combustivel = input.next();
                switch (combustivel){
                    case "gasolina":
                        tipoCombustivel = TipoCombustivel.GASOLINA;
                        break;
                    case "diesel":
                        tipoCombustivel = TipoCombustivel.DIESEL;
                        break;
                    case "gpl":
                        tipoCombustivel = TipoCombustivel.GPL;
                        break;
                    case "eletrico":
                        tipoCombustivel = TipoCombustivel.ELETRICO;
                        break;
                }
                return new Mota(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100Km);
            case "camiao":
                double capacidadeCarga;
                System.out.println("Capacidade Carga: ");
                capacidadeCarga = input.nextDouble();
                return new Camiao(marca, modelo, anoFabrico, potencia, cilindrada, litros100Km, capacidadeCarga);
        }
        return null;
    }

    public static double calcularConsumo(Veiculo veiculo){
        Scanner input = new Scanner(System.in);
        double distancia;
        System.out.println("Distancia: ");
        distancia = input.nextDouble();
        return veiculo.consumoCombustivel(distancia);
    }

    public static void corridaCarro(Veiculo veiculo){
        Carro carro1 = new Carro("Fiat", "500", 2022, 200, 100, TipoCombustivel.GASOLINA, 4.5,4);
        Veiculo vencedor = veiculo.corrida(carro1);
        if (vencedor != null) {
            System.out.println("Vencedor da corrida com o Carro: " + vencedor.getMarca() + " " + vencedor.getModelo());
        } else {
            System.out.println("Empate");
        }
    }

    public static void corridaMota(Veiculo veiculo){
        Mota mota1 = new Mota("Volkswagen", "M-3", 2015, 250, 120, TipoCombustivel.GASOLINA, 6);
        Veiculo vencedor = veiculo.corrida(mota1);
        if (vencedor != null) {
            System.out.println("Vencedor da corrida com a Mota: " + vencedor.getMarca() + " " + vencedor.getModelo());
        } else {
            System.out.println("Empate");
        }
    }

    public static void corridaCamiao(Veiculo veiculo){
        Camiao camiao1 = new Camiao("Audi", "C8", 2005, 200, 100, 5,500);
        Veiculo vencedor = veiculo.corrida(camiao1);
        if (vencedor != null) {
            System.out.println("Vencedor da corrida com o Camiao: " + vencedor.getMarca() + " " + vencedor.getModelo());
        } else {
            System.out.println("Empate");
        }
    }

    public static void calcularCustosCamiao(Veiculo veiculo){
        Scanner input = new Scanner(System.in);
        if (veiculo instanceof Camiao){
            Camiao camiaoAtual = (Camiao) veiculo;
            System.out.println("Distancia: ");
            double distancia = input.nextDouble();
            System.out.println("Carga: ");
            double carga = input.nextDouble();
            camiaoAtual.viagem(distancia,carga);
        } else {
            System.out.println("O veículo não é um camião");
        }
    }

    public static void imagemMota(Veiculo veiculo) throws FileNotFoundException {
        if (veiculo instanceof Mota){
            Mota motaAtual = (Mota) veiculo;
            motaAtual.imagem();
        } else {
            System.out.println("O veículo não é uma mota");
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Veiculo veiculo = criarVeiculo();

        int opcao;

        do {

            System.out.println("**Menu**");
            System.out.println("1. Criar Veículo");
            System.out.println("2. Calcular Consumo");
            System.out.println("3. Fazer Corrida Carro");
            System.out.println("4. Fazer Corrida Mota");
            System.out.println("5. Fazer Corrida Camiao");
            System.out.println("6. Calcular Custos Camião");
            System.out.println("7. Imprimir Imagem Mota");
            System.out.println("8. Sair");
            System.out.println("Escolha uma opção:");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    veiculo = criarVeiculo();
                    break;
                case 2:
                    double consumo = calcularConsumo(veiculo);
                    System.out.println("Consumo: " + consumo);
                    break;
                case 3:
                    corridaCarro(veiculo);
                    break;
                case 4:
                    corridaMota(veiculo);
                    break;
                case 5:
                    corridaCamiao(veiculo);
                    break;
                case 6:
                    calcularCustosCamiao(veiculo);
                    break;
                case 7:
                    imagemMota(veiculo);
                    break;
                default:
                    break;
            }

        } while (opcao != 8);



    }

}
