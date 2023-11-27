package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.AlimentacaoDieta;
import InstitutoVidaMundial.Enums.FamiliaPlanta;

public class Main {

    public static void main(String[] args) {

        Planta planta1 = new Planta("Oliveira", "Oliveira", "Portugal",15, FamiliaPlanta.Arvores,4);
        Animal animal1 = new Animal("Archie","Gato","Portugal",1,true,5,80, AlimentacaoDieta.Carnivoro,"Miau");
        Inseto inseto1 = new Inseto("Mosca", "Mosca", "Portugal", 1,false);
        Planta planta2 = new Planta("Arbusto", "Arbusto","Portugal",3,FamiliaPlanta.Ervas,1);
        Animal animal2 = new Animal("Macaco", "Macaco", "Portugal", 4, true, 7, 50, AlimentacaoDieta.Omnivoro, "Oin oin");
        Animal animal3 = new Animal("Girafa", "Girafa", "Africa do Sul", 8, true, 20, 30, AlimentacaoDieta.Herbivoro, "Hummm");
        Planta planta3 = new Planta("Girassol", "Girassol", "Portugal", 2, FamiliaPlanta.Flores, 3);

        MeioAmbiente meioAmbiente = new MeioAmbiente("Mistura", 30);

        meioAmbiente.adicionarSerVivo(planta1);
        meioAmbiente.adicionarSerVivo(planta2);
        meioAmbiente.adicionarSerVivo(planta3);
        meioAmbiente.adicionarSerVivo(animal1);
        meioAmbiente.adicionarSerVivo(animal2);
        meioAmbiente.adicionarSerVivo(animal3);
        meioAmbiente.adicionarSerVivo(inseto1);

        meioAmbiente.plantaBebe(1);
        meioAmbiente.animalBebe(5);
        meioAmbiente.plantaAbanaComVento(2);
        meioAmbiente.animalFazBarulho(4);
        meioAmbiente.animalCome(5);
        meioAmbiente.insetoChateia();

        meioAmbiente.listarSeresVivos();


    }

}
