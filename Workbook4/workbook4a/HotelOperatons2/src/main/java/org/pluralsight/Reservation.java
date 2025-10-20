package org.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean weekEnd;

    public Reservation(String roomType, int numOfNights, boolean weekEnd) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.weekEnd = weekEnd;

        if (roomType.equalsIgnoreCase("king")){
            price = 139;

        }else {
            price = 124;
        }

        if (weekEnd){
            price *= 1.10;
        }

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {this.roomType = roomType;}


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {this.price = price;}


    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {this.numOfNights = numOfNights;}


    public boolean isWeekEnd() {
        return weekEnd;
    }

    public void setWeekEnd(boolean weekEnd) {this.weekEnd = weekEnd;}

    public double getTotalPrice() {
        double total = price * numOfNights;
        return Math.round(total*100)/100.0;

    }

}
