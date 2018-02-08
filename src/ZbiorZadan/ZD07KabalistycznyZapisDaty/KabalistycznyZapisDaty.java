package ZbiorZadan.ZD07KabalistycznyZapisDaty;

import java.util.HashMap;
import java.util.Scanner;

public class KabalistycznyZapisDaty {
    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<>();

        dictionary.put("A", 1);
        dictionary.put("B", 2);
        dictionary.put("C", 3);
        dictionary.put("D", 4);
        dictionary.put("E", 5);
        dictionary.put("F", 6);
        dictionary.put("G", 7);
        dictionary.put("H", 8);
        dictionary.put("I", 9);
        dictionary.put("K", 10);
        dictionary.put("L", 20);
        dictionary.put("M", 30);
        dictionary.put("N", 40);
        dictionary.put("O", 50);
        dictionary.put("P", 60);
        dictionary.put("Q", 70);
        dictionary.put("R", 80);
        dictionary.put("S", 90);
        dictionary.put("T", 100);
        dictionary.put("V", 200);
        dictionary.put("X", 300);
        dictionary.put("Y", 400);
        dictionary.put("Z", 500);


        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int suma = 0;
        for (int i = 0; i < userInput.length(); i++) {
            suma+=(dictionary.get(Character.toString(userInput.charAt(i)).toUpperCase()));
        }
        System.out.println(suma);

    }
}
