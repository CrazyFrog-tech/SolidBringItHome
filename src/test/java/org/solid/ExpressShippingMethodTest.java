package org.solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressShippingMethodTest {
    @Test
    void calculateCost_withPositiveValues_returnsCorrectResult() {
        ExpressShippingMethod shippingMethod = new ExpressShippingMethod(2, 10.0);
        double expected = 2 * 10.0 * 0.1;
        assertEquals(expected, shippingMethod.calculateCost());
    }
}
