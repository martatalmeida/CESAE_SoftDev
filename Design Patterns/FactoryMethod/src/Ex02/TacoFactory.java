package Ex02;

public class TacoFactory {

    public static Taco criarTaco(String tipoTaco){
        tipoTaco = tipoTaco.toLowerCase();
        switch (tipoTaco){
            case "vaca":
                return new TacoCarneVaca();
            case "frango":
                return new TacoFrango();
            case "vegetariano":
                return new TacoVegetariano();
            default:
                throw new IllegalArgumentException("Tipo de taco inválido: " + tipoTaco);
        }
    }

}
