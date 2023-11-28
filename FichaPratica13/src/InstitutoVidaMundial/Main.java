package InstitutoVidaMundial;

import InstitutoVidaMundial.Enums.AlimentacaoDieta;
import InstitutoVidaMundial.Enums.FamiliaPlanta;

public class Main {

    public static void main(String[] args) {

        Planta planta1 = new Planta("Oliveira", "Oliveira", "Portugal",15, FamiliaPlanta.Arvores,4);
        Animal animal1 = new Animal("Gato","Gato","Portugal",1,true,5,80, AlimentacaoDieta.Carnivoro,"Miau");
        Inseto inseto1 = new Inseto("Mosca", "Mosca", "Portugal", 1,false);
        Planta planta2 = new Planta("Arbusto", "Arbusto","Portugal",3,FamiliaPlanta.Ervas,1);
        Animal animal2 = new Animal("Macaco", "Macaco", "Portugal", 4, true, 7, 50, AlimentacaoDieta.Omnivoro, "Oin oin");
        Animal animal3 = new Animal("Girafa", "Girafa", "Africa do Sul", 8, true, 20, 30, AlimentacaoDieta.Herbivoro, "Hummm");
        Planta planta3 = new Planta("Girassol", "Girassol", "Portugal", 2, FamiliaPlanta.Flores, 3);
        Inseto inseto2 = new Inseto("Aranha", "Tarantula", "Australia", 1,true);
        Animal animal4 = new Animal("Elefante", "Elefante", "África do Sul", 3,true,20,80,AlimentacaoDieta.Herbivoro,"Uiiiiii");
        Animal animal5 = new Animal("Vaca", "Vaca", "Portugal", 5,true,20,40,AlimentacaoDieta.Herbivoro,"Muuu");
        Animal animal6 = new Animal("Cao", "Cao", "Portugal",5,true,6,30,AlimentacaoDieta.Carnivoro,"Au au");

        MeioAmbiente meioAmbiente = new MeioAmbiente("Floresta", 30);

        meioAmbiente.adicionarSerVivo(planta1);
        meioAmbiente.adicionarSerVivo(planta2);
        meioAmbiente.adicionarSerVivo(planta3);
        meioAmbiente.adicionarSerVivo(animal1);
        meioAmbiente.adicionarSerVivo(animal2);
        meioAmbiente.adicionarSerVivo(animal3);
        meioAmbiente.adicionarSerVivo(animal4);
        meioAmbiente.adicionarSerVivo(animal5);
        meioAmbiente.adicionarSerVivo(animal6);
        meioAmbiente.adicionarSerVivo(inseto1);
        meioAmbiente.adicionarSerVivo(inseto2);


        meioAmbiente.simulador(3);


    }

}
