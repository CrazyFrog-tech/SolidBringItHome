package org.solid.dependencyinversion;

import org.solid.ExpressShippingMethod;

public class ExpressShippingCalculator implements ShippingCalculator{
    private ExpressShippingMethod expressShippingMethod;

    public ExpressShippingCalculator(ExpressShippingMethod expressShippingMethod) {
        this.expressShippingMethod = expressShippingMethod;
    }
    @Override public double calculateCost() {
        return this.expressShippingMethod.calculateCost();
    }
}
