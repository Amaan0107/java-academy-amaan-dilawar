package com.pluralsight;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = scanner.nextLine();

        System.out.print("Enter hours Worked (bi-weekly):");
        int hours =  scanner.nextInt();

        System.out.print("Enter hourly wage:");
        double wage = scanner.nextDouble();

        double grossPay = hours * wage;

        if (hours>80) {
            double overTimeWage = grossPay + (wage * 1.5);
            System.out.println("Name: " + name);
            System.out.println("Gross pay (including over time):" + overTimeWage);
        }
        else {
            System.out.println("Name: " + name);
            System.out.println("Gross pay: " + grossPay);
        }

        scanner.close();
       

    }
}
