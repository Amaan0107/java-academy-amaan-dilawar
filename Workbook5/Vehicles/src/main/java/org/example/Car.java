package org.example;

public class Car extends Vehicle {
    public Car(int fuelCapacity, String color, int numberOfPassengers, int cargoCapacity) {
        super(color, fuelCapacity, numberOfPassengers, cargoCapacity);
    }
    public Car(){
        super();
    }
}
