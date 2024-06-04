package org.solid;

public class ExpressShippingCalculator implements IShippingCalculator {
    private ExpressShippingMethod shippingMethod;

    public ExpressShippingCalculator(double weight, double distance) {
        shippingMethod = new ExpressShippingMethod(weight, distance);
    }

    public double calculateShippingCost() {
        return shippingMethod.calculateShippingCost();
    }
}
