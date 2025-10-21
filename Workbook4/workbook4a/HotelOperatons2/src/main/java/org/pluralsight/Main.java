package org.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        Room room2 = new Room(1, 126.00, false, true);
        System.out.println("Room available? " + room2.isAvailable());


        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation1.getTotalPrice());


        Employee emp1 = new Employee(1, "Kim", "Front Desk", 20.0, 0);

        emp1.punchIn(10.0);
        emp1.punchOut(12.5);

        emp1.punchIn(14.0);
        emp1.punchOut(18.0);

        System.out.println("Total hours worked: " + emp1.getHoursWorked());
        System.out.println("Total pay: $" + emp1.getTotalPay());
    }
}

