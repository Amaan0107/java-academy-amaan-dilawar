package org.example;
import java.util.Scanner;
public class CellPhonept2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();

        System.out.print("What is the Serial number ? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone ? ");
        cellPhone1.setPhoneModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier ? ");
        cellPhone1.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number ? ");
        cellPhone1.setPhoneNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner ? ");
        cellPhone1.setOwner(scanner.nextLine().trim());

        System.out.println("--------------------------");

        CellPhone cellPhone2 = new CellPhone();

        System.out.print("What is the Serial number ? ");
        cellPhone2.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone ? ");
        cellPhone2.setPhoneModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier ? ");
        cellPhone2.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number ? ");
        cellPhone2.setPhoneNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner ? ");
        cellPhone2.setOwner(scanner.nextLine().trim());

        scanner.close();
        System.out.println("--------------------------");

        CellPhone cellPhone3 = new CellPhone( 9876543, "iPhone 15 Pro", "Verizon",
                "888-555-1212", "Alice");



        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1);
        cellPhone3.dial(cellPhone1);

    }
    public static void display(CellPhone CellPhone){
        System.out.println("\n Here is the phones info:");
        System.out.println("Serial number: " + CellPhone.getserialNumber());
        System.out.println("Phone model: " + CellPhone.getPhoneModel());
        System.out.println("Phone carrier: " + CellPhone.getCarrier());
        System.out.println("Phone number: " + CellPhone.getPhoneNumber());
        System.out.println("Owner: " + CellPhone.getOwner());

        System.out.println("--------------------------");
    }

}
