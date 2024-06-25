package org.solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.solid.methods.MemberShippingMethod;

class MemberShippingMethodTest {

    @Test
    void calculateShippingCost() {
        MemberShippingMethod memberShippingMethod = new MemberShippingMethod(100, 500);
        assertEquals(10000, memberShippingMethod.calculateShippingCost());
    }

    @Test
    void calculateShippingCostWithNoDistance() {
        MemberShippingMethod memberShippingMethod = new MemberShippingMethod(100, 0);
        assertEquals(0, memberShippingMethod.calculateShippingCost());
    }

    @Test
    void calculateShippingDuration() {
        MemberShippingMethod memberShippingMethod = new MemberShippingMethod(100, 500);
        assertEquals(7, memberShippingMethod.calculateDurationCost());
    }

    @Test
    void calculateShippingDurationWithNoDistance() {
        MemberShippingMethod memberShippingMethod = new MemberShippingMethod(0, 0);
        assertEquals(2, memberShippingMethod.calculateDurationCost());
    }
}
