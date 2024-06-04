package org.solid;

public class StandardShippingMethod implements ShippingMethod{
    private final double distance;
    private final double weight;

    public StandardShippingMethod(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    @Override public double calculateCost() {
        return distance * weight * 0.5;
    }
}
