package org.solid;

public class Main {
    public static void main(String[] args) {
        IShippingCalculator shippingCalculator = new ExpressShippingCalculator(10, 100);
        System.out.println("Express shipping cost: " + shippingCalculator.calculateShippingCost());

        IShippingCalculator shippingCalculator2 = new StandardShippingCalculator(10, 100);
        System.out.println("Standard shipping cost: " + shippingCalculator2.calculateShippingCost());

        IShippingCalculator shippingCalculator3 = new MemberShippingCalculator(10, 100);
        System.out.println("Member shipping cost: " + shippingCalculator3.calculateShippingCost());
    }
}
