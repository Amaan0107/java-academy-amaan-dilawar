package org.pluralsight;

public class Room {
    private int numOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numOfBeds, double price, boolean occupied, boolean dirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public int getNumOfBeds() {return numOfBeds;}

    public double getPrice() {return price;}

    public boolean isOccupied() {return occupied;}

    public boolean isDirty() {return dirty;}

    public boolean isAvailable() {return !occupied && !dirty;}
}
