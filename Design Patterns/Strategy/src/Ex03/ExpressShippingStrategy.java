package Ex03;

public class ExpressShippingStrategy implements ShippingStrategy{


    @Override
    public double calculateCost(double pesoPacote) {
        double custo = pesoPacote * 10;
        return custo;
    }
}
