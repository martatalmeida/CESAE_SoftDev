package FichaPraticaExtraFunçoes;

import java.util.Scanner;

public class Ex09 {

    public static String mesCorrespondente(int num) {

        String mes;

        switch (num) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Não há um mês correspondente";
                break;
        }

        return mes;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInteiro;
        String mes;

        System.out.println("Insira um numero entre 1-12: ");
        numInteiro = input.nextInt();

        mes = mesCorrespondente(numInteiro);
        System.out.println(mes);

    }

}
