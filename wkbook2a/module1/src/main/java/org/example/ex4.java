package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.SortedMap;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (first and last): ");
        String name = scanner.nextLine().trim();

        System.out.println("What date will you be coming ?(dd/mm/yyyy): ");
        String date = scanner.nextLine().trim();

        System.out.println("How many tickets would you like ? : ");
        int tickets = scanner.nextInt();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationsDay = LocalDate.parse(date, format);

        String [] nameParts = name.split(" ");

        if(nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println(tickets + " tickets reserved for " + reservationsDay + " under " + lastName + ", " + firstName);
        }
    }
}
