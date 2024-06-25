package org.solid;

public class MemberShippingMethod extends ShippingMethod implements IDurationCalculator {
    public MemberShippingMethod(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateShippingCost() {
        return 0.2 * this.weight * this.distance;
    }

    @Override
    public double calculateDurationCost() {
        return this.distance / 100 + 2;
    }
}
