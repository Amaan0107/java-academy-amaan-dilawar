package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basicCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num11 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();


        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("Pick one of the following operations 1-4:");
        int pick = scanner.nextInt();

        double result = num11 * num2;
        System.out.println("The Result is: " + result);

        scanner.close();
    }
}
