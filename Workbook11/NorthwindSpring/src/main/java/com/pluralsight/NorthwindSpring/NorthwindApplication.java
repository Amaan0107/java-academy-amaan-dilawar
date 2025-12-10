package com.pluralsight.NorthwindSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // eat newline

            if (choice == 1) {
                for (Product p : productDao.getAll()) {
                    System.out.println(p);
                }
            }
            else if (choice == 2) {
                System.out.print("Enter Product ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Category: ");
                String category = scanner.nextLine();

                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();

                productDao.add(new Product(id, name, category, price));
                System.out.println("Product added!");
            }
            else if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option.");
            }
        }
    }
}
