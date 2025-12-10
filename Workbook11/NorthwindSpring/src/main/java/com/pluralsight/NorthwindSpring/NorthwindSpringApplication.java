package com.pluralsight.NorthwindSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindSpringApplication {

    private final ProductDao productDao;

    public NorthwindSpringApplication(ProductDao productDao) {
        this.productDao = productDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(NorthwindSpringApplication.class, args).start();
    }

    public void startUI() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                for (Product p : productDao.getAll()) {
                    System.out.println(p);
                }
            } else if (choice == 2) {
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter Name:");
                String name = scanner.nextLine();

                System.out.println("Enter Category:");
                String category = scanner.nextLine();

                System.out.println("Enter Price:");
                double price = scanner.nextDouble();

                productDao.add(new Product(id, name, category, price));
            } else if (choice == 0) {
                break;
            }
        }
    }
}
