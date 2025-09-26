package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Example calls
        AgeDoubler(20);
        AgeDoubler(50);
    }

    // Method that doubles the age and calculates years until retirement
    public static void AgeDoubler(int age) {
        int doubledAge = age * 2;
        int yearsUntilRetirement = 65 - age;

        // Make sure yearsUntilRetirement is not negative
        if (yearsUntilRetirement < 0) {
            yearsUntilRetirement = 0;
        }


    }
}
