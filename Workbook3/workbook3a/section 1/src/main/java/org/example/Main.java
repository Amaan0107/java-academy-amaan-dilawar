package org.example;
import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {
                "1. The best way to predict the future is to create it.",
                "2. In the middle of every difficulty lies opportunity.",
                "3. Don’t watch the clock; do what it does. Keep going.",
                "4. It always seems impossible until it’s done.",
                "5. Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "6. Be yourself; everyone else is already taken.",
                "7. The journey of a thousand miles begins with one step.",
                "8. Happiness is not something ready-made. It comes from your own actions.",
                "9. You miss 100% of the shots you don’t take.",
                "10. Do what you can, with what you have, where you are."
        };
        try {
            System.out.println("Pick a number from 1-10:");
            int pick = scanner.nextInt();

            pick--;

            System.out.println(quotes[pick]);

        } catch (Exception e) {
            System.out.println("Your number is out of range!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }



    }}