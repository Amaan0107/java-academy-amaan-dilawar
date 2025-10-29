package org.example;
import java.time.Year;


public class Vehicle extends Asset {
    private String make;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalPrice,
                   String make, int year, int odometer) {
        super(description, dateAcquired, originalPrice);
        this.make = make;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getPrice() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        double value = getOriginalPrice();

        if (age >= 1 && age <= 3) {
            value = -value * (0.03 * age);
        } else if (age >= 4 && age <= 6) {
            value = -value * (0.06 * age);
        } else if (age >= 7 && age <= 10) {
            value = -value * (0.08 * age);
        } else {
            value = -10000;
        }
        if (odometer > 100000 &&
                !(make.toLowerCase().contains("honda") ||
                        make.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }
        return value;
    }
}
