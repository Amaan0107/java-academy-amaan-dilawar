package org.example;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name (first last or first middle last): ");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        }else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts [2];

            char firstLetter = middleName.charAt(0);
            System.out.println("First name: " + firstName);
            System.out.println("Middle initial: " + firstLetter + ".");
            System.out.println("Last name: " + lastName);
        }
        scanner.close();
    }
}
