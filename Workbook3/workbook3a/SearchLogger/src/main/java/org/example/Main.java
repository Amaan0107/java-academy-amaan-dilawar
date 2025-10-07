package org.example;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void logAction(String action) {
        try( BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt",true))){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timeStamp = now.format(fmt);

            writer.write(timeStamp + " " + action);
            writer.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logAction("Launch");
        System.out.println("Search Engine Logger started!");
        System.out.println("Enter a search term (X to exit): ");

        String term;
        while (true) {
            System.out.print("Enter search: ");
            term = scanner.nextLine().trim();

            if (term.equalsIgnoreCase("X")) {
                // c) Log exit
                logAction("exit");
                System.out.println("👋 Exiting Search Engine Logger...");
                break;

            } else if (!term.isEmpty()) {
                logAction("search : " + term);
                System.out.println("🔍 Searching for: " + term);
            }

        }
        scanner.close();
    }


}

