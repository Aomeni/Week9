package com.lab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShippingCalculatorTest {
    @Test
    public void testCalculateShipping() {
        ShippingCalculator calc = new ShippingCalculator();
        double result = calc.calculateShipping(10.0, 100.0);
        assertEquals(15.0, result, 0.01);
    }
}