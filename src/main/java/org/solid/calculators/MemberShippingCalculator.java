package org.solid.calculators;

import org.solid.interfaces.IShippingCalculator;
import org.solid.methods.MemberShippingMethod;

public class MemberShippingCalculator implements IShippingCalculator {
    private MemberShippingMethod shippingMethod;

    public MemberShippingCalculator(double weight, double distance) {
        shippingMethod = new MemberShippingMethod(weight, distance);
    }

    public double calculateShippingCost() {
        return shippingMethod.calculateShippingCost();
    }
}
