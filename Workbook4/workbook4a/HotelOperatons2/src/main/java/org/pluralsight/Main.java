package org.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        // 📅 Test Reservation
        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation1.getTotalPrice());

        // 👩‍💼 Test Employee
        Employee emp1 = new Employee(8973, "Kim", "Front Desk", 20.00, 45);
        System.out.println("Employee: " + emp1.getName());
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOverTimeHours());
        System.out.println("Total Pay: $" + emp1.getTotalPay());
    }
}

