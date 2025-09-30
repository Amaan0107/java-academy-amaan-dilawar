package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex1 {
    public static void main(String[] args) {
        String fullName = getFullName(); // Call your method
        System.out.println("Full name: " + fullName);
    }

    private static String getFullName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter middle name (press enter to skip): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter suffix (press enter to skip): ");
        String suffix = scanner.nextLine().trim();

        scanner.close();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            char firstLetter = middleName.charAt(0);
            fullName += " " + firstLetter + ". ";
        }
            fullName += "" + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        return fullName;
    }
}

