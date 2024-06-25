package org.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.solid.methods.ExpressShippingMethod;

class ExpressShippingMethodTest {

    @Test
    void calculateShippingCost() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod(100, 500);
        assertEquals(5000, expressShippingMethod.calculateShippingCost());
    }

    // Function is not capable to handle zero values
    @Test
    void calculateShippingCostWithNoDistance() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod(100, 0);
        assertEquals(0, expressShippingMethod.calculateShippingCost());
    }

    @Test
    void calculateShippingDuration() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod(100, 500);
        assertEquals(6, expressShippingMethod.calculateDurationCost());
    }

    @Test
    void calculateShippingDurationWithNoDistance() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod(0, 0);
        assertEquals(1, expressShippingMethod.calculateDurationCost());
    }
}
