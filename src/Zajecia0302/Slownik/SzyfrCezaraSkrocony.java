package Zajecia0302.Slownik;

import java.util.HashMap;

public class SzyfrCezaraSkrocony {
    public static void main(String[] args) {
        HashMap<String, String > szyfrCezara = new HashMap<>();
//        HashMap<Integer, String > szyfrCezara = new HashMap<>();

//        szyfrCezara.put(0, "A");
//        szyfrCezara.put(1, "B");
//        szyfrCezara.put(2, "C");
//        szyfrCezara.put(3, "D");
//        szyfrCezara.put(4, "E");
//        szyfrCezara.put(5, "F");
//        System.out.println(szyfrCezara.get(0+3));

        szyfrCezara.put("A", "D");
        szyfrCezara.put("B", "E");
        szyfrCezara.put("C", "F");
        szyfrCezara.put("D", "G");
        szyfrCezara.put("E", "H");
        szyfrCezara.put("F", "I");

        System.out.println(szyfrCezara.get("A"));
        szyfrCezara.remove("A");
        System.out.println(szyfrCezara);

    }
}
