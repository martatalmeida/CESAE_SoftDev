package Exercicio04;

public class Main {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Alameda Eca Queiros", 120, "Porto", Tipo.APARTAMENTO, Acabamento.USADA, 60, 3, 2, 20);
        Imovel imovel2 = new Imovel("Avenida dos Combatentes", 100, "Porto", Tipo.CASA, Acabamento.PARA_RESTAURO, 80, 2, 2, 15);


        double valor1 = imovel1.valorImovel();
        System.out.println("Valor Total do imovel1: " + valor1);

        double valor2 = imovel2.valorImovel();
        System.out.println("Valor Total do imovel2: " + valor2);

        imovel2.setAcabamento(Acabamento.NOVA);

        System.out.println("");
        double valor3 = imovel2.valorImovel();
        System.out.println("Valor Total do imovel2: " + valor3);

        System.out.println("");
        imovel1.imprimirDescricao();
        System.out.println("");
        imovel2.imprimirDescricao();


        System.out.println("");
        Imovel caro = imovel1.compararImoveis(imovel2);
        System.out.println("O imóvel mais caro é: " + caro.getRua() + " " + caro.getNumPorta() + ", " + caro.getCidade());
    }

}
