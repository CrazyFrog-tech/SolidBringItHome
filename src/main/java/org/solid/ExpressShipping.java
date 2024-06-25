package org.solid;

public interface ExpressShipping extends ShippingMethod {
    int calculateDuration(int distance);
}
