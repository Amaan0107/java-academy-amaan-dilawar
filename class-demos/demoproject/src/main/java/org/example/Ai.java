package org.example;

public class Ai {
    public static void main(String[] args) {
        String heroName = "Aria";
        int health = 100;           // HP
        int gold = 0;               // coins
        boolean hasMagicKey = false;
        double potionPower = 12.5;  // healing amount


        System.out.println(heroName + " enters Javaria with " + health + " HP and " + gold + " gold.");

        health = health - 40;
        int armor = 5;            /* your value */;
        int potionCount = 2;/* your value */;

// Use a potion:
        potionCount = potionCount - 1;
        health = health + 15;

        System.out.println("Health: " + health + ", Potions left: " + potionCount);




        int enemyHP = 30;
        int attackPower = 8;
        int round = 0;

        while (enemyHP > 0) {
            round++;
            enemyHP -= attackPower;
            System.out.println("Round " + round + ": enemy HP now " + enemyHP);
        }
        System.out.println("Enemy defeated after " + round + " rounds!");



        int[] chests = {10, 25, 5};


// fill this loop
        for (int i = 0; i < chests.length; i++) {
            System.out.println(heroName + " explores chest and finds " + chests[i] + " gold coins" );
            gold += chests[i];
        }

        System.out.println("Gold after chests: " + gold);




    }
}
