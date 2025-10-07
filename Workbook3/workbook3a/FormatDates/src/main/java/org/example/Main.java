package org.example;
import java.time.format.DateTimeFormatter;
import java.time.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and time: " + now);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss");


        System.out.println(now.format(format1));
        System.out.println(now.format(format2));
        System.out.println(now.format(format3));
        System.out.println(now.format(format4));

        ZonedDateTime localTime = ZonedDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, dd-MMM-yyyy hh:mm a z");
        System.out.println(localTime.format(fmt));
    }
}