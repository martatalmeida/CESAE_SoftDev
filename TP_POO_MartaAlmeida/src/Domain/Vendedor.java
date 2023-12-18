package Domain;

import Controllers.JogoController;
import Domain.ItensHeroi.ItemHeroi;
import Repository.ItensRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Vendedor {

    private ArrayList<ItemHeroi> loja;

    public Vendedor() throws FileNotFoundException {
        ItensRepository repositorio = new ItensRepository("Ficheiro/ItensHeroiRPG.csv");
        this.loja = repositorio.getItensArray();
    }



}
