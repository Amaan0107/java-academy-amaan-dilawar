package org.example;
import java.util.Scanner;
public class ex6pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone CellPhone = new CellPhone();

        System.out.print("What is the Serial number ? ");
        CellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone ? ");
        CellPhone.setPhoneModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier ? ");
        CellPhone.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number ? ");
        CellPhone.setPhoneNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner ? ");
        CellPhone.setOwner(scanner.nextLine().trim());

        scanner.close();

        System.out.println("\n Here is the phones info:");
        System.out.println("Serial number: " + CellPhone.getserialNumber());
        System.out.println("Phone model: " + CellPhone.getPhoneModel());
        System.out.println("Phone carrier: " + CellPhone.getCarrier());
        System.out.println("Phone number: " + CellPhone.getPhoneNumber());
        System.out.println("Owner: " + CellPhone.getOwner());

    }
}
