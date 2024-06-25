package org.solid.dependencyinversion;

import org.solid.openClosed.MemberShippingMethod;

public class MemberShippingCalculator implements ShippingCalculator {
    private MemberShippingMethod memberShippingMethod;
    public MemberShippingCalculator(MemberShippingMethod memberShippingMethod) {
        this.memberShippingMethod = memberShippingMethod;
    }

    @Override public double calculateCost() {
        return 0;
    }
}
