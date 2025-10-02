package org.example;

public class For {
    public static void main(String[] args) {
        for (int time = 10; time > 0; time--) {
            System.out.println(time);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Lunch!!");
    }
}
