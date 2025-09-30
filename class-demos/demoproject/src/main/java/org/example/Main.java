package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". I will be a good developer ");
        }


        int days;

            for (days = 5; days >= 0; days--) {
            if (days == 0) {
                System.out.println(days + " more day left at Year Up Code Academy");
            } else {
                System.out.println(days + " more days left at Year Up Code Academy");
            }

        }

        System.out.println("For Loop: Counting only evens");
        for (int i = 2; i <= 6; i+=2) {
            System.out.println("Iteration " + i);
        }


        System.out.println("\nWhile Loop: Counting down from 5");
        int j = 10;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            j--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer was interrupted.");
            }
        }
        System.out.println("Wake up!!!");



        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("\nDo...While Loop: Run at least once");
        do {
            System.out.println("Type something (or type 'exit' to stop): " );
             input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));
        System.out.println("Program Ended !");
        scanner.close();

    }
}