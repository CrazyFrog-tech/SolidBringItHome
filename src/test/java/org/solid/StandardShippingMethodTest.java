package org.solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.solid.methods.StandardShippingMethod;

class StandardShippingMethodTest {

    @Test
    void calculateShippingCost() {
        StandardShippingMethod standardShippingMethod = new StandardShippingMethod(100, 500);
        assertEquals(25000, standardShippingMethod.calculateShippingCost());
    }
}
