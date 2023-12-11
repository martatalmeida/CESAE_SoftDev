package Ex03;

public class ShippingCalculator {

    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double pesoPacote){
        double custo = shippingStrategy.calculateCost(pesoPacote);
        return custo;
    }

}
