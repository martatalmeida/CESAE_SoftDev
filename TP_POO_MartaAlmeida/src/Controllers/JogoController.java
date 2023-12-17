package Controllers;

import Domain.ItensHeroi.ItemHeroi;
import Repository.ItensRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JogoController {

    private ArrayList<ItemHeroi> todosOsItens;

    public JogoController() throws FileNotFoundException {
        ItensRepository repositorio = new ItensRepository("Ficheiro/ItensHeroiRPG.csv");
        this.todosOsItens = repositorio.getItensArray();
    }



}
