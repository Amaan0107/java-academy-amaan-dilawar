package org.example;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }


    public void Deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }


    public int getValue(){
        int value = 0;

        for(Card card: cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }

        return value;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString();
    }
}


