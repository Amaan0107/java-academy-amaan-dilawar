package org.pluralsight;

public class Hotel {
    private String name;
    private int numOfSuits;
    private int numOfRooms;
    private int bookedSuits;
    private int bookedBasicRooms;

    public Hotel(String name, int numOfSuits, int numOfRooms) {
        this.name = name;
        this.numOfSuits = numOfSuits;
        this.numOfRooms = numOfRooms;
        this.bookedSuits = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numOfSuits, int numOfRooms, int bookedSuits, int bookedBasicRooms) {
        this.name = name;
        this.numOfSuits = numOfSuits;
        this.numOfRooms = numOfRooms;
        this.bookedSuits = bookedSuits;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuits = bookedSuits;
    }

    public int getAvailableSuits() {
        return numOfSuits - bookedSuits;
    }

    public int getAvailableRooms() {
        return numOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public boolean bookRoom(int roomNumber, boolean isSuit) {
        if (isSuit)
            if (bookedSuits <= roomNumber) {
                bookedSuits += roomNumber;
                System.out.println(roomNumber + " Suite(s) booked successfully");
                return true;
            } else {
                System.out.println("Room is already booked.");
                return false;
            }
        else {
            if (numOfRooms <= getAvailableRooms()) {
                bookedBasicRooms += roomNumber;
                System.out.println(roomNumber + " Room(s) booked successfully");
                return true;
            } else {
                System.out.println("Room is already booked.");
                return false;
            }
        }
    }
}


