package org.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExpressShippingMethodTest {

    @Test
    void calculateShippingCost() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        assertEquals(5000, expressShippingMethod.CalculateShippingCost(100, 500));
    }

    // Function is not capable to handle zero values
    @Test
    void calculateShippingCostWithNoDistance() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        assertEquals(0, expressShippingMethod.CalculateShippingCost(100, 0));
    }
}
