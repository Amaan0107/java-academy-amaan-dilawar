package org.example;

public class TestStats {
    public static void main(String[] args) {
        int[] scores = {87, 78, 56, 89, 34, 98, 82, 69, 67, 41};

        System.out.println("\n All scores:");
        for (int score : scores){
            System.out.println(score + "");
        }
        System.out.println("\n");

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for(int score : scores){
            sum += score;
            if (score > highest)highest = score;
            if (score < lowest)lowest = score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Highest test score: " + highest);
        System.out.println("Lowest test score: " + lowest);
        System.out.println("Average test score: " + average);

    }
}
