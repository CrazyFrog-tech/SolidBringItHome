package org.solid;

public class Main {

    public static void main(String[] args) {
        ShippingMethod standardShippingMethod = new StandardShippingMethod(10, 5);
        ShippingMethod expressShippingMethod = new ExpressShippingMethod(5, 10);

        System.out.println("Standard Shipping Cost: " + standardShippingMethod.calculateCost());
        System.out.println("Express Shipping Cost: " + expressShippingMethod.calculateCost());
    }
}
