package org.example;
import java.util.Scanner;

class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double discountRate = 0.0;
        double regular = 5.45;
        double large = 8.95;
        double basePrice = 0.0;

        System.out.print("Would you like (1) Regular for $" + regular
                + " or a (2) Large for $" + large + ": ");
        int size = scanner.nextInt();

        if (size == 1) {
            basePrice = regular;
        } else if (size == 2) {
            basePrice = large;
        } else {
            System.out.println("Invalid selection.");
            scanner.close();
            return;
        }

        System.out.println("Would you like your Sandwich loaded?");
        System.out.println("1. Regular ($1.00)");
        System.out.println("2. Large ($1.75)");
        System.out.println("3. No");
        int loaded = scanner.nextInt();

        if(loaded == 1){
            basePrice += 1.00;
        } else if (loaded == 2) {
            basePrice += 1.75;
        }else {
            System.out.println("Thank you for your selection!!");
        }

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

            if (age <= 17) {
            discountRate = 0.10;
        } else if (age >= 65) {
            discountRate = 0.20;
        }

        double discount = basePrice * discountRate;
        double finalPrice = basePrice - discount;

        System.out.printf("Your sandwich costs: $%.2f\n", finalPrice);

        scanner.close();
    }
}
