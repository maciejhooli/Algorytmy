package Zajecia0302.Deck;

public class CardShuffelingDemo {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printAll();

        System.out.println("*******");
        deck.shuffle();
        deck.printAll();
    }
}
