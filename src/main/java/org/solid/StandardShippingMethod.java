package org.solid;

public class StandardShippingMethod extends ShippingMethod {
    @Override
    public double calculate(int weight, int distance) {
        return weight * distance * 0.5;
    }
}
