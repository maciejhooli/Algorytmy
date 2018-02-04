package Zajecia0302.Slownik;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> dzieci = new HashMap<>();


        int test = 5;
        String testValue = "5555";
        dzieci.put(1, "Kowalski");
        dzieci.put(2, "ZZZ");
        dzieci.put(test, testValue);

        String ele = dzieci.get(2);

        for (Integer key : dzieci.keySet()) {
            System.out.println(dzieci.get(key));
        }


    }
}
