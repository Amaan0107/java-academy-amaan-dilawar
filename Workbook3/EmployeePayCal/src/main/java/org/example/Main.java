package org.example;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee.csv"));

            String line;

            System.out.printf("%-5s %-20s %-10s %-10s %-10s\n",
                    "ID", "Name", "Hours", "Rate", "Gross Pay");


            System.out.println("----------------------------------------------------------");


            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hours = Double.parseDouble(parts[2]);
                double rate = Double.parseDouble(parts[3]);


                Employee emp = new Employee(id, name, hours, rate);
                System.out.printf("%-5d %-20s %-10.2f %-10.2f %-10.2f\n",
                        emp.getEmployeeID(), emp.getName(), emp.getHoursWorked(),
                        emp.getPayRate(), emp.getGrossPay());
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}