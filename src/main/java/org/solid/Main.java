package org.solid;

public class Main {
    public static void main(String[] args) {
        ShippingMethod shippingMethod = new ExpressShippingMethod();
        double cost = shippingMethod.CalculateShippingCost(10, 100);
        System.out.println("Express shipping cost: " + cost);

        shippingMethod = new StandardShippingMethod();
        cost = shippingMethod.CalculateShippingCost(10, 100);
        System.out.println("Standard shipping cost: " + cost);
    }
}
