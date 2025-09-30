package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String movieTittle = "Super Natural";
        System.out.println("My fav tv show in upper case: " + movieTittle.toUpperCase());
        // While loop
        System.out.println("\nPassword is incorrect:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect;
        String password = "1234";
        String enterPassword = "";

        while (!enterPassword.equals(password)) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();
            if (!enterPassword.equals(password)) ;
            {
                System.out.println("Incorrect");
            }

            while (passwordIncorrect = true) {
                System.out.println("What is the password?");
                enterPassword = read.nextLine();
                if (!enterPassword.equals(password)) ;
                {

                    System.out.println("Incorrect");
                }
                passwordIncorrect = false;

            }
        }
    }
}