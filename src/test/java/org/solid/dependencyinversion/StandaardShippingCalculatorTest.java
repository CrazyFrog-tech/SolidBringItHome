package org.solid.dependencyinversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.solid.ShippingMethod;
import org.solid.StandardShippingMethod;

class StandaardShippingCalculatorTest {
    @Test
    void calculateCost_withPositiveValues_returnsCorrectResult() {
        ShippingMethod shippingMethod = new StandardShippingMethod(2, 10.0);
        StandaardShippingCalculator calculator = new StandaardShippingCalculator((StandardShippingMethod) shippingMethod);
        double expected = 2 * 10.0 * 0.5;
        assertEquals(expected, calculator.calculateCost());
    }

}
