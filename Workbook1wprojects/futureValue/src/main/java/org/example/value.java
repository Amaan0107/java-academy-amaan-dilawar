package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.printf("Enter interest rate (1.90): ");
        double interestRate = scanner.nextDouble();

        System.out.printf("Total years for CD to mature: ");
        int years = scanner.nextInt();

        interestRate = interestRate/100;

        double futureValue = depositAmount * Math.pow(1 + interestRate/365, 365 * years);

        double interest = futureValue - depositAmount;

        System.out.printf("Future value is: $%.2f\n", futureValue);
        System.out.printf("Total interest earned: $%.2f\n", interest);
    }
}
