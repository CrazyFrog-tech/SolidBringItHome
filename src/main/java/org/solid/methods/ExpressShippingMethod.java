package org.solid.methods;

import org.solid.interfaces.IDurationCalculator;

public class ExpressShippingMethod extends ShippingMethod implements IDurationCalculator {
    public ExpressShippingMethod(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateShippingCost() {
        return 0.1 * this.weight * this.distance;
    }

    @Override
    public double calculateDurationCost() {
        return this.distance / 100 + 1;
    }
}
