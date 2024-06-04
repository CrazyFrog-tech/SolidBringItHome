package org.solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandardShippingMethodTest {
    @Test
    void calculateCost_withPositiveValues_returnsCorrectResult() {
        StandardShippingMethod shippingMethod = new StandardShippingMethod(2, 10.0);
        double expected = 2 * 10.0 * 0.5;
        assertEquals(expected, shippingMethod.calculateCost());
    }

}
