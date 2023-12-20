import Controllers.JogoController;
import Domain.ItensHeroi.ArmaPrincipal;
import Domain.ItensHeroi.ItemHeroi;
import Domain.Personagem.Elfo;
import Domain.Personagem.NPC;
import Domain.Vendedor;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainTeste {

    public static void main(String[] args) throws FileNotFoundException {

        Elfo elfo = new Elfo("Marta",100,30,1,50);
        ArmaPrincipal armaPrincipal = new ArmaPrincipal("Espada",30,20,30);
        elfo.setArmaPrincipal(armaPrincipal);

        NPC npc = new NPC("Orc",100,10,100);

        Vendedor vendedor = new Vendedor();

        JogoController jogoController = new JogoController();

        jogoController.loja(vendedor, elfo);


    }

}
