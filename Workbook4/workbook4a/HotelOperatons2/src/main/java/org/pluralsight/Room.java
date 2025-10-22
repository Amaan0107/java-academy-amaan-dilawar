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
    public Room() {
        this.numOfBeds = 1;
        this.price = 100.00;
        this.occupied = false;
        this.dirty = false;
    }
    public int getNumOfBeds() {return numOfBeds;}

    public double getPrice() {return price;}

    public boolean isOccupied() {return occupied;}

    public boolean isDirty() {return dirty;}

    public boolean isAvailable() {return !occupied && !dirty;}

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            System.out.println("Room has been checked out");

        }else {
            System.out.println("There is a error room is either occupied or needs to be cleaned ");
        }
    }
    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Room has been checked out. Room should be cleaned");
        }else {
            System.out.println("Cannot check out. Room is not occupied");
        }

    }
    public void cleanRoom() {
        if (!occupied && dirty) {
            dirty = true;
            System.out.println("Room has been cleaned and is ready");
        }else {
            System.out.println("Room has already been cleaned or occupied ");
        }
    }
}
