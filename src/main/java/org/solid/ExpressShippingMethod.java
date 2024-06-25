package org.solid;

public class ExpressShippingMethod {
    public double calculate(int weight, int distance) {
        return weight * distance * 0.1;
    }
}
