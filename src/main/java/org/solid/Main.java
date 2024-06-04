package org.solid;

import org.solid.dependencyinversion.ExpressShippingCalculator;
import org.solid.dependencyinversion.ShippingCalculator;
import org.solid.dependencyinversion.StandaardShippingCalculator;

public class Main {

    public static void main(String[] args) {
        ShippingMethod standardShippingMethod = new StandardShippingMethod(10, 5);
        ShippingMethod expressShippingMethod = new ExpressShippingMethod(5, 10);

        ShippingCalculator standardShippingCalculator = new StandaardShippingCalculator(
            (StandardShippingMethod) standardShippingMethod);
        ShippingCalculator expressShippingCalculator = new ExpressShippingCalculator((ExpressShippingMethod) expressShippingMethod);

        System.out.println("Standard Shipping Cost: " + standardShippingCalculator.calculateCost());
        System.out.println("Express Shipping Cost: " + expressShippingCalculator.calculateCost());
    }
}
