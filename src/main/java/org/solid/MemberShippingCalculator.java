package org.solid;

public class MemberShippingCalculator implements IShippingCalculator {
    private MemberShippingMethod shippingMethod;

    public MemberShippingCalculator(double weight, double distance) {
        shippingMethod = new MemberShippingMethod(weight, distance);
    }

    public double calculateShippingCost() {
        return shippingMethod.calculateShippingCost();
    }
}
