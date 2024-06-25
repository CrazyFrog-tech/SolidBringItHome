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

    @Test
    void Distance0ReturnsZero() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        int duration = expressShippingMethod.calculateDuration(0);
        assertThat(duration).isEqualTo(0);
    }

    @Test
    void Distance500Returns6() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        int duration = expressShippingMethod.calculateDuration(500);
        assertThat(duration).isEqualTo(6);
    }

    @Test
    void Distance100Returns2() {
        ExpressShippingMethod expressShippingMethod = new ExpressShippingMethod();
        int duration = expressShippingMethod.calculateDuration(100);
        assertThat(duration).isEqualTo(2);
    }
}
