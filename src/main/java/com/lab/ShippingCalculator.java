package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Calculates shipping costs based on weight and shipping type.
 */
public class ShippingCalculator {

  private static final Logger logger = LoggerFactory.getLogger(ShippingCalculator.class);

  /**
   * Calculates the shipping fee.
   *
   * @param weight the weight of the shipment in kilograms
   * @param type the shipping type, either "EXPRESS" or "STANDARD"
   * @return the calculated shipping fee
   */
  public double calculate(double weight, String type) {
    logger.info("Calculating shipping type={} weight={}", type, weight);

    if (weight <= 0) {
      logger.error("Invalid weight {}", weight);
      throw new IllegalArgumentException("Weight must be positive");
    }

    if ("EXPRESS".equals(type)) {
      return weight * 5000 + 20000;
    }

    if ("STANDARD".equals(type)) {
      return weight * 3000;
    }

    logger.error("Unknown type {}", type);
    throw new IllegalArgumentException("Unknown type: " + type);
  }
}
