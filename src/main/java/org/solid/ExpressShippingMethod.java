package org.solid;

public class ExpressShippingMethod extends ShippingMethod {
    public ExpressShippingMethod(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateShippingCost() {
        return 0.1 * this.weight * this.distance;
    }

    public double calculateShippingDuration() {
        return this.distance / 100 + 1;
    }
}
