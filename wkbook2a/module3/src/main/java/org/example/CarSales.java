package org.example;
import java.util.Locale;
import java.util.Scanner;

public class CarSales {
    private static Inventory[] vehicles = new Inventory[20];
    private static int vehicleCount = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        vehicles[0] = new Inventory(928032, "Nissan Altima", "Grey", 69872, 12000);
        vehicles[1] = new Inventory(783212, "Honda Civic", "Black", 94500, 10000);
        vehicles[2] = new Inventory(123892, "Toyota Rav4", "Blue", 130839, 6000);
        vehicles[3] = new Inventory(218910, "Toyota Corolla", "Black", 56029, 16000);
        vehicles[4] = new Inventory(219301, "Nissan Z350", "Red", 47039, 25000);
        vehicles[5] = new Inventory(829321, "Ford Explorer", "While", 75980, 15000);

        while (true) {
            System.out.println("\n What would you like to do ?");
            System.out.println("1. List all vehicles");
            System.out.println("2. Search by make/model");
            System.out.println("3. Search by pricing");
            System.out.println("4. Search by color");
            System.out.println("5. Add vehicle");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByModel(scanner);
                    break;
                case 3:
                    searchByPricing(scanner);
                    break;
                case 4:
                    searchByColor(scanner);
                    break;
                case 5:
                    addVehicle(scanner);
                    break;
                case 6:
                    System.out.println("Good Bye!");
                    return;
                default:
                    System.out.println("Invalid Try again");
            }
        }
    }

    public static void listAllVehicles() {
        System.out.println("\n------Vehicle Inventory------");
        for (int i = 0; i < vehicleCount; i++){
            System.out.println(vehicles[i]);
        }
    }
    public static void searchByModel(Scanner scanner){
        System.out.print("Enter make/model: ");
        String search = scanner.nextLine().toLowerCase();

        for (int i = 0; i < vehicleCount; i ++){
            if (vehicles[i].getMakeModel().toLowerCase().contains(search)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void searchByPricing(Scanner scanner){
        System.out.print("Enter min price: ");
        float min = scanner.nextFloat();
        System.out.print("Enter max price");
        float max = scanner.nextFloat();

        for (int i = 0; i < vehicleCount; i++){
            if (vehicles[i].getPrice()>= min && vehicles[i].getPrice() <= max){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void searchByColor(Scanner scanner){
        System.out.print("Enter color: ");
        String search = scanner.nextLine().toLowerCase();

        for (int i = 0; i < vehicleCount; i++){
            if (vehicles[i].getColor().toLowerCase().contains(search)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void addVehicle(Scanner scanner){
        if (vehicleCount >= vehicles.length){
            System.out.println("Inventory is full");
            return;
        }
        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong(); scanner.nextLine();
        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter odometer reading: ");
        int odo = scanner.nextInt();
        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        vehicles[vehicleCount] = new Inventory(id, makeModel, color, odo, price);
        vehicleCount++;

        System.out.println("Vehicle added successfully!");
    }
}