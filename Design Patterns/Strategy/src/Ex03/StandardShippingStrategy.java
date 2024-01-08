package Ex03;

public class StandardShippingStrategy implements ShippingStrategy{


    @Override
    public double calculateCost(double pesoPacote) {
        double custo = pesoPacote * 5;
        return custo;
    }
}
