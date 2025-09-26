package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Movie {
    public static void main(String[] args) {
        String movieName = "The darkness of the 1941-1945";
        int numOfFriends = 5;
        double sliceCost = 3.99;
        boolean popcorn = true;
        double totalPizzaCost = sliceCost * numOfFriends;
        long roundedTotal = Math.round(totalPizzaCost);
        double drinkCost = 2.59;
        double total = totalPizzaCost + (drinkCost * numOfFriends);


        System.out.println("We're watching " + movieName + " with " + numOfFriends + " friends.");
        System.out.println("Pizza cost about $" + sliceCost + " per slice.");
        System.out.println("Yes, it's " + popcorn + " we had popcorn.");
        System.out.println("It cost about $" + totalPizzaCost + "in total.");
        if (popcorn) {
            System.out.println("Popcorn Time !!");
        }
        else {
            System.out.println("Order the Popcorn!");
        }
        System.out.println("Rounded up total of pizza: $" + roundedTotal);

        if (roundedTotal>30)  {
            System.out.println("Whoh, that's a lot of pizza! 🍕");
        }
        else {
            System.out.println("Nice budget-friendly movie night!");
        }
        System.out.printf("Movie: " + movieName + " | " + "Guests: " + numOfFriends + " including me | "
                + "Total Cost: $" + Math.round(total));
    }
}
