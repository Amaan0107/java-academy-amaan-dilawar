package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class carRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the type of car you would like to rent (sedan, suv, 2d, truck):");
        String carType = scanner.nextLine().toLowerCase();

        double pricePerDay = 0.0;

        switch (carType) {
            case "sedan":
                pricePerDay = 35;
                break;
            case "suv":
                pricePerDay = 50;
                break;
            case "truck":
                pricePerDay = 65;
                break;
            case "2d":
                pricePerDay = 80;
                return;
        }

        System.out.print("Enter pick-up date (ex. 01/18/2007):");
        String pickUpDate = scanner.nextLine();

        System.out.print("How many days would you like to rent this car in days:");
        int rentalDays = scanner.nextInt();

        System.out.print("Would you like a electronic toll tag ($3.95-day)(yes/no):");
        String tollTag = scanner.nextLine().toLowerCase();

        System.out.print("Would you like GPS ($2.95-day)(yes/no)");
        String gps = scanner.nextLine().toLowerCase();

        System.out.print("Would you like road side assistance ($3.95-day)(yes/no):");
        String assistance = scanner.nextLine().toLowerCase();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        double basicRental = pricePerDay * rentalDays;
        double tollTagCost = tollTag.equals("yes")? 3.95 * rentalDays :0;
        double gpsCost = gps.equals("yes")? 2.95 * rentalDays :0;
        double assistanceCost = assistance.equals("yes")? 3.95 * rentalDays :0;
        double optionsCost = tollTagCost + gpsCost + assistanceCost;

        double surCharge = 0;
        if (age<25) {
            surCharge = 15 * rentalDays;
        }
        double totalCost = basicRental + optionsCost + surCharge;

        System.out.println("\n--- Rental Summary ---");
        System.out.println("Pickup date: " + pickUpDate);
        System.out.printf("Basic car rental cost: $%.2f\n", basicRental);
        System.out.printf("Options cost: $%.2f\n", optionsCost);
        System.out.printf("Underage driver surcharge: $%.2f\n", surCharge);
        System.out.printf("Total cost: $%.2f\n", totalCost);

        scanner.close();
        System.out.println("The basic car rental is $" + basicRental + "." + " The surcharge price for anyone" +
                " under 25 is $" + surCharge + "." + " All taxes have been incorporated in the fees shown.");
    }
}