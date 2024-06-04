package org.solid.dependencyinversion;

import org.solid.StandardShippingMethod;

public class StandaardShippingCalculator implements ShippingCalculator {
    private StandardShippingMethod standardShippingMethod;

    public StandaardShippingCalculator(StandardShippingMethod standardShippingMethod) {
        this.standardShippingMethod = standardShippingMethod;
    }

    @Override public double calculateCost() {
        return this.standardShippingMethod.calculateCost();
    }
}
