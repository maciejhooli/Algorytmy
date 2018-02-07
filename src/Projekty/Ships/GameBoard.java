package Projekty.Ships;

import Projekty.OneHundredCounting.Game;

import java.util.Random;

public class GameBoard {
    private int n = 11;
    private int m = 11;
    String[][] board = new String[n][m];

    GameBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "E \t";
            }
        }
    }

    public void putFourOnBoard() {
        Random rand = new Random();

        ShipsE ship = ShipsE.FOUR;

        for (int i = 0; i < ship.getShipAmount(); i++) {
            int wiersz = rand.nextInt(10);
            int kolumna = rand.nextInt(10);
            int kierunek = rand.nextInt(2);
            for (int j = 0; j < ship.getShipSize(); j++) {
                if (kierunek == 0 && kolumna<=6) {//poziomo
                    //TODO Dopisać sprawdzenie czy miesci sie na planszy
                    board[wiersz][kolumna] = ShipsE.FOUR.toString();
                    kolumna++;
                } else if (kierunek == 1 && wiersz<=6) { //pionowo
                    board[wiersz][kolumna] = ShipsE.FOUR.toString();
                    wiersz++;
                }
            }

            //TODO ZADANIE DO WYKONANIA NA 09.02.2018
        }
    }

    public void printAll(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();

        }
    }
}