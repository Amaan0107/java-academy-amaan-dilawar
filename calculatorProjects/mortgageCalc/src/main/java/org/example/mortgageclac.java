package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class mortgageCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan amount :");
        double loan = scanner.nextDouble();

        System.out.print("Enter yearly interest rate :");
        double yearlyInterest = scanner.nextDouble();

        System.out.print("Enter loan length in years :");
        int years = scanner.nextInt();

        scanner.close();

        yearlyInterest = yearlyInterest/12;
        double monthlyInterest = yearlyInterest/100;
        int months = years * 12;

        double onePlusRateToPower = Math.pow(1 + monthlyInterest, months);
        double monthlyPayment = loan * (monthlyInterest * onePlusRateToPower) / (onePlusRateToPower - 1);

        double totalPayed = monthlyPayment * months;
        double interestRate =  totalPayed - loan;

        System.out.printf("Monthly payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total interest paid: $%.2f%n", interestRate);

    }
}