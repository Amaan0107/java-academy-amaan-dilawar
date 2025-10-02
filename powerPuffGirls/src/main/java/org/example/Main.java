package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String Charactername = "Blossom";
        // Todo: A PowerPuff fight game
        // features
        // Play online
        // customize characters
        // costumes
        // solo mode
        // finishing moves
        // team attack
        //dialogue
        Character blossom = new Character("Blossom", "Pink");
        blossom.setHealth(70);
        System.out.println(blossom.getHealth());
        blossom.takeDamage(30);
        blossom.Heal(40);
        System.out.println(blossom.getHealth());




    }
}