package org.solid;

public class ExpressShippingMethod implements ShippingMethod {
    @Override
    public double calculate(int weight, int distance) {
        return weight * distance * 0.1;
    }
}
