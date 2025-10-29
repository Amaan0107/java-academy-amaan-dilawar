package org.example;

public abstract class Asset {
    private String description;
    private String dateAcquired;
    private double originalPrice;


    public Asset(String description, String dateAcquired, double originalPrice) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalPrice = originalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public double getPrice() {
        return originalPrice;
    }
}
