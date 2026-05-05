package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {

    private static final Logger logger = LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double Weight_Cua_Toi, String type) {
        logger.info("Calculating shipping type={} weight={}", type, Weight_Cua_Toi);

        if (Weight_Cua_Toi <= 0) {
            logger.error("Invalid weight {}", Weight_Cua_Toi);
            throw new IllegalArgumentException("Weight must be positive");
        }

        if ("EXPRESS".equals(type)) return Weight_Cua_Toi*5000+20000;
        if ("STANDARD".equals(type)) return Weight_Cua_Toi * 3000;

        logger.error("Unknown type {}", type);
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}