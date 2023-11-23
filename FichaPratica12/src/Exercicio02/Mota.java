package Exercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
    }

    public void imagem() throws FileNotFoundException {

        File file = new File("Mota.txt");
        Scanner scanner = new Scanner(file);

        String linha1;

        while (scanner.hasNextLine()){
            linha1 = scanner.nextLine();
            System.out.println(linha1);
        }

    }

}
