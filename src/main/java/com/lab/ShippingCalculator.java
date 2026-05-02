package com.lab;

public class ShippingCalculator {
    public double calculateShipping(double weight, double distance) {
        return weight * 0.5 + distance * 0.1;
    }
}