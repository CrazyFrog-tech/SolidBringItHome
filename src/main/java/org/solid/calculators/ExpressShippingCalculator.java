package org.solid.calculators;

import org.solid.methods.ExpressShippingMethod;
import org.solid.interfaces.IShippingCalculator;

public class ExpressShippingCalculator implements IShippingCalculator {
    private ExpressShippingMethod shippingMethod;

    public ExpressShippingCalculator(double weight, double distance) {
        shippingMethod = new ExpressShippingMethod(weight, distance);
    }

    public double calculateShippingCost() {
        return shippingMethod.calculateShippingCost();
    }
}
