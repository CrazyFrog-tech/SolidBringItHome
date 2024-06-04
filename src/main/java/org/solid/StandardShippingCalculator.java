package org.solid;

public class StandardShippingCalculator implements IShippingCalculator {
    private StandardShippingMethod shippingMethod;

    public StandardShippingCalculator(double weight, double distance) {
        shippingMethod = new StandardShippingMethod(weight, distance);
    }

    public double calculateShippingCost() {
        return shippingMethod.calculateShippingCost();
    }
}
