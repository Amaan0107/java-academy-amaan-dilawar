package org.example;

public class Dicemain {
    public static void main(String[] args) {
        Dicemethods dice1 = new Dicemethods();
        Dicemethods dice2 = new Dicemethods();

        int count2 = 0, count4 = 0, count6 = 0, count7 = 0;

        for(int i = 1; i <= 100; i++){
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();
            int sum = roll2 + roll1;

            System.out.println("Roll " + i + " : " + roll1 + " + " + roll2 + " = " + sum );

            if (sum == 2) count2++;
            if (sum == 4) count4++;
            if (sum == 6) count6++;
            if (sum == 7) count7++;
        }
        System.out.println("\n Results of 100 Rolls:");
        System.out.println("Number of 2's rolled: " + count2);
        System.out.println("Number of 4's rolled: " + count4);
        System.out.println("Number of 6's rolled: " + count6);
        System.out.println("Number of 7's rolled: " + count7);
    }
}
