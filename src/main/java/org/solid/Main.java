package org.solid;

public class Main {
    public static void main(String[] args) {
        ShippingMethod standardShippingMethod = new StandardShippingMethod();
        ShippingMethod expressShippingMethod = new ExpressShippingMethod();
        double costsStandard = standardShippingMethod.calculate(1, 1);
        System.out.println("Standard Shipping Method: " + costsStandard);
        double costExpress = expressShippingMethod.calculate(1, 1);
        System.out.println("Express Shipping Method: " + costExpress);
        int duration = expressShippingMethod.calculateDuration(100);
        System.out.println("Duration: " + duration);
    }
}