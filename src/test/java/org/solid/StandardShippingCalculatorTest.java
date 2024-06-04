package org.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StandardShippingCalculatorTest {

    @Test
    void calculateShippingCost() {
        StandardShippingCalculator standardShippingCalculator = new StandardShippingCalculator(100, 500);
        assertEquals(25000, standardShippingCalculator.calculateShippingCost());
    }

}
