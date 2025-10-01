package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CellPhone {
    private int serialNumber;
    private String phoneModel;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.phoneModel = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }
    public int getserialNumber(){
        return serialNumber;

    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;

    }

    public String getPhoneModel() {
        return phoneModel;

    }


    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;

    }

    public String getCarrier() {
        return carrier;

    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;

    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getOwner() {
        return owner;

    }

    public void setOwner(String owner) {
        this.owner = owner;

    }

    public void dial(String phoneNumber){
        System.out.println(this.owner + "'s phone is calling " + phoneNumber);

    }

    public CellPhone(int serialNumber, String phoneModel, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void dial(CellPhone phone){
        System.out.println(this.owner + " is calling " + phone.getOwner());
        System.out.println("Dialing number:" + phone.getPhoneNumber());
    }
}

