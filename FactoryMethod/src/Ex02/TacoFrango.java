package Ex02;

public class TacoFrango extends Taco{


    @Override
    public void prepare() {
        System.out.println("A preparar taco de frango");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de frango");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco de frango");
    }
}
