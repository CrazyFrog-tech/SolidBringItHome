package org.solid;

public class ExpressShippingMethod extends ShippingMethod {

    @Override
    public double CalculateShippingCost (double weight, double distance) {
        return 0.1 * weight * distance;
    }
}
