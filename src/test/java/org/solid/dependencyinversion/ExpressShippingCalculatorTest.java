package org.solid.dependencyinversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.solid.ExpressShippingMethod;

class ExpressShippingCalculatorTest {

    @Test
    void calculateCost_withPositiveValues_returnsCorrectResult() {
        ExpressShippingMethod shippingMethod = new ExpressShippingMethod(2, 10.0);
        ExpressShippingCalculator calculator = new ExpressShippingCalculator(shippingMethod);
        double expected = 2 * 10.0 * 0.1;
        assertEquals(expected, calculator.calculateCost());
    }



}
