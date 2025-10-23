package org.example;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }
    public String getName() {
        return name;
    }
    public void dealCard(Card card){
        hand.Deal(card);
    }
    public int getHandValue(){
        return hand.getValue();
    }
    public Hand getHand(){
        return hand;
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand.getValue() + " points";
    }
}
