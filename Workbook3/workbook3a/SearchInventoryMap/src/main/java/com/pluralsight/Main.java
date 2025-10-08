package com.pluralsight;
import  java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Map<String, Product> loadInventory(){
        Map<String, Product> inventoryMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Inventory.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3){
                    String category = parts[0].trim();
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());

                    Product p = new Product(category, name, price);
                    inventoryMap.put(name.toLowerCase(), p);
                }
            }
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        return inventoryMap;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the search inventory!!!");
        System.out.println("-------------------------------------------");

        Map<String, Product> inventory = loadInventory();

        System.out.println("Inventory loaded successfully. (" + inventory.size() + " products)\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter product name to search (X to exit): ");
            String search = scanner.nextLine().trim();

            if (search.equalsIgnoreCase("X")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            Product found = inventory.get(search.toLowerCase());

            if (found != null) {
                System.out.println("Product found: " + found);
            } else {
                System.out.println("Product not found.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
