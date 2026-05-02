package com.lab;

public class Main {
    public static void main(String[] args) {
        ShippingCalculator calc = new ShippingCalculator();
        double cost = calc.calculateShipping(10.0, 100.0);
        System.out.println("Shipping cost: " + cost);
    }
}