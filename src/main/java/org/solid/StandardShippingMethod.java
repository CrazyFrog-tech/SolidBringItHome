package org.solid;

public class StandardShippingMethod extends ShippingMethod {

    @Override
    public double CalculateShippingCost(double weight, double distance) {
        return 0.5 * weight * distance;
    }
}
