package org.solid;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ExpressShippingMethodTest {

    @Test
    void Weight1AndDistance1ReturnsZeroPointOne() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        double cost = expressShippingMethod.calculate(1, 1);
        assertThat(cost).isEqualTo(0.1);
    }

    @Test
    void Weight1AndDistance2ReturnsZeroPointTwo() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        double cost = expressShippingMethod.calculate(1, 2);
        assertThat(cost).isEqualTo(0.2);
    }

    @Test
    void Weight3AndDistance3ReturnsZeroPointNine() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        double cost = expressShippingMethod.calculate(3, 3);
        assertThat(cost).isEqualTo(0.9);
    }
}
