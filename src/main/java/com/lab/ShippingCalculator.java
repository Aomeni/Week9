package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {

    private static final Logger logger = LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double weight, String type) {
        logger.info("Calculating shipping type={} weight={}", type, weight);

        if (weight <= 0) {
            logger.error("Invalid weight {}", weight);
            throw new IllegalArgumentException("Weight must be positive");
        }

        if ("EXPRESS".equals(type)) return weight * 5000 + 20000;
        if ("STANDARD".equals(type)) return weight * 3000;

        logger.error("Unknown type {}", type);
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}