package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nList: ");
        System.out.println("Goldilocks.txt");
        System.out.println("HanselnGretel.txt");
        System.out.println("Mary Had a Little Lamb.txt");
        System.out.println("-------------------------------------");

        System.out.print("Enter the name of a story: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error reading the file. Please make sure it exists and is in the correct folder.");
        }

        scanner.close();
    }
}

