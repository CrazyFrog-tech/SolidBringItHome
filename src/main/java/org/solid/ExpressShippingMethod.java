package org.solid;

public class ExpressShippingMethod implements ExpressShipping {
    @Override
    public double calculate(int weight, int distance) {
        return weight * distance * 0.1;
    }

    @Override
    public int calculateDuration(int distance) {
        return distance / 100 + 1;
    }
}
