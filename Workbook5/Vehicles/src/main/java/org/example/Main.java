package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Moped slowRide = new Moped();

    slowRide.setFuelCapacity(5);
    slowRide.setColor("Red");

        System.out.println("Slow Ride Fuel Capacity: " + slowRide.getFuelCapacity());
        System.out.println("Slow Ride Color: " + slowRide.getColor());

    }
}