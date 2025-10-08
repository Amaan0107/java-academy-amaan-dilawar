package com.pluralsight;
import java.util.ArrayList;
public class Display {
    public static ArrayList<Inventory> getInventory() {
        ArrayList<Inventory> product = new ArrayList<>();
        product.add(new Inventory("Electronics","Laptop", 599.99));
        product.add(new Inventory("Liquor", "Jack Daniel's", 24.99));
        product.add(new Inventory("Frozen food", "Frozen Pizza", 12.99));
        product.add(new Inventory("Beverage", "Cola", 2.99));
        product.add(new Inventory("Baby/Toddler", "Baby food", 5.99 ));
        
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to our stores inventory !!!");
        System.out.println("--------------------------------------------");

        ArrayList<Inventory> product = getInventory();

        for (Inventory i : product){
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        System.out.println("Total items in inventory: " + product.size());
    }

}
