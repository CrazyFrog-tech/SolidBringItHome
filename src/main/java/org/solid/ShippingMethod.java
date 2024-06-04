package org.solid;

public abstract class ShippingMethod {
    public abstract double CalculateShippingCost(double weight, double distance);
}
