package Zajecia0302.Deck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    private Colors colors;

    //Generowanie tali kart
    public Deck() {
        for (int i = 0; i < Figures.values().length; i++) {
            for (int j = 0; j < Colors.values().length; j++) {
                deck.add(new Card(Colors.getValueBasedOnInt(j), Figures.getValueBasedOnInt(i)));
            }
        }
    }

    public void printAll() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}
