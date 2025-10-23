package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player p1 = new Player("Bam");
        Player p2 = new Player("Bob");

        p1.dealCard(deck.deal());
        p2.dealCard(deck.deal());
        p1.dealCard(deck.deal());
        p2.dealCard(deck.deal());

        System.out.println(p1.getName() + " has " + p1.getHand());
        System.out.println(p2.getName() + " has " + p2.getHand());
    }
}