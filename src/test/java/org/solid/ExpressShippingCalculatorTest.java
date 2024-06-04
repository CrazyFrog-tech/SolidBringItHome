package org.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExpressShippingCalculatorTest {

    @Test
    void calculateShippingCost() {
        ExpressShippingCalculator expressShippingCalculator = new ExpressShippingCalculator(100, 500);
        assertEquals(5000, expressShippingCalculator.calculateShippingCost());
    }
}
