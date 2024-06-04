package org.solid;

public abstract class ShippingMethod {
    public double weight;
    public double distance;

    public ShippingMethod(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    public abstract double calculateShippingCost();
}
