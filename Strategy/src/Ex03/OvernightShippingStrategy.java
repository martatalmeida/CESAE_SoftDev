package Ex03;

public class OvernightShippingStrategy implements ShippingStrategy{


    @Override
    public double calculateCost(double pesoPacote) {
        double custo = pesoPacote * 15;
        return custo;
    }
}
