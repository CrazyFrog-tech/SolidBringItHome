package org.solid.methods;

public class StandardShippingMethod extends ShippingMethod {
    public StandardShippingMethod(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateShippingCost() {
        return 0.5 * this.weight * this.distance;
    }
}
