package org.solid.openClosed;

import org.solid.ShippingMethod;
import org.solid.interfaceSegregation.DurationCalculator;

public class MemberShippingMethod implements ShippingMethod, DurationCalculator {
    private final double weight;
    private final double distance;

    public MemberShippingMethod(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override public double calculateDuration() {
        return 0;
    }

    @Override public double calculateCost() {
        return 0;
    }
}
