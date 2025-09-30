package org.example;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter game score(ex. Home:Visitor|21:9): ");
        String input = scanner.nextLine().trim();

        String[] parts = input.split("\\|");
        if (parts.length != 2) {
            System.out.println("Invalid input format");
            return;
        }

        String [] teams = parts[0].split(":");
        String [] scores = parts[1].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if(homeScore > visitorScore){
            System.out.println("Winner: " + homeTeam);
        } else {
            System.out.println("Winner: " + visitorTeam);

        }
    }
}
