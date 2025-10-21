package org.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 139.00, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        Room room2 = new Room(1, 126.00, false, true);
        System.out.println("Room available? " + room2.isAvailable());


        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation1.getTotalPrice());

        System.out.println("--------------------------------------------");


        Employee emp1 = new Employee(1, "Kim", "Front Desk", 20.0, 0);

        emp1.punchIn(10.0);
        emp1.punchOut(12.5);


        System.out.println(emp1.getName() + " Total hours worked: " + emp1.getHoursWorked());
        System.out.println(emp1.getName() + " Total pay: $" + emp1.getTotalPay());

        System.out.println("--------------------------------------------");

        Employee emp2 = new Employee(2, "Lim", "Bellman", 20.0, 0);

        emp2.punchIn();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        emp2.punchOut();

        System.out.println(emp2.getName() + " Total hours worked: " + emp2.getHoursWorked());
        System.out.println(emp2.getName() + " Total pay: $" + emp2.getTotalPay());

        System.out.println("--------------------------------------------");

        Hotel hotel1 = new Hotel("Techno Inn", 200, 300 );
        System.out.println("Available Suits:" + hotel1.getAvailableSuits());
        System.out.println("Available Rooms:" + hotel1.getAvailableRooms());

        hotel1.bookRoom(3, true);
        hotel1.bookRoom(5, false);

        System.out.println("Suits remaining:" + hotel1.getAvailableSuits());
        System.out.println("Rooms remaining:" + hotel1.getAvailableRooms());
    }
}

