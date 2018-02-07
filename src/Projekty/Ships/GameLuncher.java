package Projekty.Ships;

public class GameLuncher {
    public static void main(String[] args) {
        GameBoard compBoard = new GameBoard();
        compBoard.putFourOnBoard();
        compBoard.printAll();

    }
}
