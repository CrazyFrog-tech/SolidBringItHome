package org.solid;

import org.solid.interfaceSegregation.DurationCalculator;

public class ExpressShippingMethod implements ShippingMethod, DurationCalculator {
    private final double weight;
    private final double distance;

    public ExpressShippingMethod(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    @Override public double calculateCost() {
        return weight * distance * 0.1;
    }
    @Override public double calculateDuration() {
        return this.distance / 100 + 1;
    }
}
