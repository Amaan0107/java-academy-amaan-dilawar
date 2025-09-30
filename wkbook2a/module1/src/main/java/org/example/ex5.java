package org.example;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Enter Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.println("Enter Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.println("Enter Billing State: ");
        String billingState = scanner.nextLine().trim();

        System.out.println("Enter Billing zip code: ");
        int billingZipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.println("Enter shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.println("Enter shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.println("Enter shipping zip code: ");
        int shippingZipCode = scanner.nextInt();
        scanner.nextLine();

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(name).append("\n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(",");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZipCode);

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(",");
        shippingAddress.append(shippingState).append(" ");
        shippingAddress.append(shippingZipCode);

        System.out.println("\n Billing Address ");
        System.out.println(billingAddress);

        System.out.println("\n Shipping Address ");
        System.out.println(shippingAddress);

        scanner.close();


    }
}
