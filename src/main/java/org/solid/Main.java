package org.solid;

import org.solid.dependencyinversion.ExpressShippingCalculator;
import org.solid.dependencyinversion.MemberShippingCalculator;
import org.solid.dependencyinversion.ShippingCalculator;
import org.solid.dependencyinversion.StandaardShippingCalculator;
import org.solid.openClosed.MemberShippingMethod;

public class Main {

    public static void main(String[] args) {
        ShippingMethod standardShippingMethod = new StandardShippingMethod(10, 5);
        ShippingMethod expressShippingMethod = new ExpressShippingMethod(5, 10);
        ShippingMethod memberShippingMethod = new MemberShippingMethod(10, 5);

        ShippingCalculator standardShippingCalculator = new StandaardShippingCalculator(
            (StandardShippingMethod) standardShippingMethod);
        ShippingCalculator expressShippingCalculator = new ExpressShippingCalculator((ExpressShippingMethod) expressShippingMethod);
        ShippingCalculator memberShippingCalculator = new MemberShippingCalculator((MemberShippingMethod) memberShippingMethod);

        System.out.println("Standard Shipping Cost: " + standardShippingCalculator.calculateCost());
        System.out.println("Express Shipping Cost: " + expressShippingCalculator.calculateCost());
        System.out.println("Member Shipping Cost: " + memberShippingCalculator.calculateCost());
    }
}
