package com.pluralsight;

public class Inventory {
    private String name;
    private double price;
    private String category;

    public Inventory(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", category = '" + category + '\'' +
                '}';
    }
}

