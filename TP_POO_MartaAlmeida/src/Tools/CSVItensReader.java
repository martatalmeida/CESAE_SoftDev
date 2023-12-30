package Tools;

import Domain.ItensHeroi.ArmaPrincipal;
import Domain.ItensHeroi.ConsumivelCombate;
import Domain.ItensHeroi.ItemHeroi;
import Domain.ItensHeroi.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVItensReader {

    private String filePath;

    public CSVItensReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Método que separa os herois permitidos e os coloca num ArrayList
     * @param heroiPermitidoFile String com todos os herois permitidos de um certo item
     * @return ArrayList com os herois que sao permitidos comprarem o item
     */
    public ArrayList<String> verheroisPermitidos(String heroiPermitidoFile){
        heroiPermitidoFile = heroiPermitidoFile.replace("[","");
        heroiPermitidoFile = heroiPermitidoFile.replace("]","");
        String[] arrayHeroisPermitidos = heroiPermitidoFile.split(",");
        ArrayList<String> heroisPermitidos = new ArrayList<>();
        for (int i = 0; i < arrayHeroisPermitidos.length; i++){
            heroisPermitidos.add(arrayHeroisPermitidos[i]);
        }
        return heroisPermitidos;
    }

    /**
     * Método para ler o ficheiro CSV com os itens e passá-lo para o repositório
     * @return ArrayList dos itens do ficheiro
     * @throws FileNotFoundException se não encontrar o ficheiro
     */
    public ArrayList<ItemHeroi> readCSVToRepository() throws FileNotFoundException {
        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<ItemHeroi> arrayItens = new ArrayList<>();
        ItemHeroi item = null;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int preco = Integer.parseInt(linhaDividida[2]);
            String heroisPermitidos = linhaDividida[3];
            int ataque = Integer.parseInt(linhaDividida[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividida[5]);
            int ataqueInstantaneo = Integer.parseInt(linhaDividida[6]);
            int vida = Integer.parseInt(linhaDividida[7]);
            int forca = Integer.parseInt(linhaDividida[8]);

            switch (tipo){
                case "ArmaPrincipal":
                    item = new ArmaPrincipal(nome,preco,ataque,ataqueEspecial);
                    break;
                case "ConsumivelCombate":
                    item = new ConsumivelCombate(nome,preco,ataqueInstantaneo);
                    break;
                case "Pocao":
                    item = new Pocao(nome,preco,vida,forca);
                    break;
            }

            arrayItens.add(item);
            item.addHeroisPermitido(verheroisPermitidos(heroisPermitidos));

        }
        return arrayItens;
    }

}
