package Repository;

import Domain.ItensHeroi.ItemHeroi;
import Tools.CSVItensReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ItensRepository {

    private ArrayList<ItemHeroi> itensArray;

    public ItensRepository(String filePath) throws FileNotFoundException {
        CSVItensReader csvItensReader = new CSVItensReader(filePath);
        this.itensArray = csvItensReader.readCSVToRepository();
    }

    public ArrayList<ItemHeroi> getItensArray() {
        return itensArray;
    }
}
