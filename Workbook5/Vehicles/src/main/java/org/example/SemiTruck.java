package org.example;

public class SemiTruck extends Vehicle {
    public SemiTruck(int fuelCapacity, String color, int numberOfPassengers, int cargoCapacity) {
        super(color, fuelCapacity, numberOfPassengers, cargoCapacity);
    }
    public SemiTruck(){
        super();
    }
}

