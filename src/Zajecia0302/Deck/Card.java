package Zajecia0302.Deck;

public class Card {
    Colors colors;
    Figures figures;

    public Card(Colors colors, Figures figures){
        this.colors = colors;
        this.figures = figures;
    }

    public Colors getColors() {
        return colors;
    }

    public Figures getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        return colors.name() + " " + figures.name();
    }
}
