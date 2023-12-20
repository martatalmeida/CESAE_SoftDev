
import Domain.Personagem.Heroi;
import View.JogoView;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Heroi heroi = JogoView.menuCriarPersonagem();

        JogoView.Jogo(heroi);



    }

}
