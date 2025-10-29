package org.example;

public class Cash extends Asset{
    public Cash(String description, String dateAcquired, double originalPrice) {
        super(description, dateAcquired, originalPrice);
    }
    @Override
    public double getPrice() {
        return getOriginalPrice();
    }
}
