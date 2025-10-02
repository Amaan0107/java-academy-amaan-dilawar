package org.example;

public class Inventory {
    private long vehicleID;
    private String makeModel;
    private  String color;
    private int mileAge;
    private float price;

    public Inventory(long vehicleID, String makeModel, String color, int mileAge, float price){
       this.vehicleID = vehicleID;
       this.makeModel = makeModel;
       this.color = color;
       this.mileAge = mileAge;
       this.price = price;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getMakeModel(){
        return  makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "ID: " + vehicleID + ", " + makeModel + ", " + color + ", Mileage: " + mileAge
                + ", Set Price at: $" + price;
    }
}

