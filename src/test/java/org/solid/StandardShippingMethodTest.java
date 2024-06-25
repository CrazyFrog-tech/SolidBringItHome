package org.solid;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StandardShippingMethodTest {

    @Test
    void Weight1AndDistance1ReturnsHalf() {
        StandardShippingMethod standardShippingMethod = new StandardShippingMethod();
        double cost = standardShippingMethod.calculate(1, 1);

        assertThat(cost).isEqualTo(0.5);
    }

    @Test
    void Weight1AndDistance2Returns1() {
        StandardShippingMethod standardShippingMethod = new StandardShippingMethod();
        double cost = standardShippingMethod.calculate(1, 2);

        assertThat(cost).isEqualTo(1);
    }

    @Test
    void Weight2AndDistance3Returns3() {
        StandardShippingMethod standardShippingMethod = new StandardShippingMethod();
        double cost = standardShippingMethod.calculate(2, 3);

        assertThat(cost).isEqualTo(3);
    }
}
