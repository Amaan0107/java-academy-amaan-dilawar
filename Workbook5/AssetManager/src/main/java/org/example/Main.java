package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2018-05-15", 250000,
                "123 Maple St", 1, 2000, 6000));
        assets.add(new House("Vacation Home", "2020-07-10", 350000,
                "99 Ocean View", 2, 1800, 8000));


        assets.add(new Vehicle("Tom's Truck", "2019-03-12", 40000,
                "Toyota Tacoma", 2019, 85000));
        assets.add(new Vehicle("My Sedan", "2015-09-02", 30000,
                "Ford Fusion", 2015, 120000));


        for (Asset asset : assets) {
            System.out.printf("\nDescription: %s%n", asset.getDescription());
            System.out.printf("Date Acquired: %s%n", asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", asset.getOriginalPrice());
            System.out.printf("Current Value: $%.2f%n", asset.getPrice());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year/Make-Model: " + vehicle.getYear() + " " + vehicle.getMake());
            }
        }
    }
}
