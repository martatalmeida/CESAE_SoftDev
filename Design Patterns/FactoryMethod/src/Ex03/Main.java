package Ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tipo de Documento [Texto][Calculo][Apresentacao]: ");
        String tipo = input.next();

        System.out.println("Nome: ");
        String nome = input.next();

        System.out.println("Autor: ");
        String autor = input.next();

        Document document = DocumentFactory.criarDocumento(tipo,autor,nome);

        document.open();
        document.save();
        document.close();

    }

}
