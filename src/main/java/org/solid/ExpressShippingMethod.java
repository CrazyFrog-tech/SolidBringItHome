package org.solid;

public class ExpressShippingMethod implements ShippingMethod{
    private final double weight;
    private final double distance;

    public ExpressShippingMethod(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    @Override public double calculateCost() {
        return weight * distance * 0.1;
    }
}
