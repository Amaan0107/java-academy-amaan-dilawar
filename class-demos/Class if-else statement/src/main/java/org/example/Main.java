package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String user = "Amaan123";

        System.out.print("Enter password:");
            String password = scanner.nextLine();

         if (password.equals(user)) {
             System.out.println("correct password !!");
         } else {
             System.out.println("Incorrect try again...");
         }
         scanner.close();
    }
}