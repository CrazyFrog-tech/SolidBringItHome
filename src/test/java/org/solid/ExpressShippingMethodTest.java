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

    @Test
    void calculateDuration_withPositiveDistance_returnsCorrectResult() {
        ExpressShippingMethod shippingMethod = new ExpressShippingMethod(2, 200.0);
        double expected = 200.0 / 100 + 1;
        assertEquals(expected, shippingMethod.calculateDuration());
    }

    @Test
    void calculateDuration_withZeroDistance_returnsMinimumDuration() {
        ExpressShippingMethod shippingMethod = new ExpressShippingMethod(2, 0.0);
        double expected = 0.0 / 100 + 1;
        assertEquals(expected, shippingMethod.calculateDuration());
    }

}
