package Zajecia2701;

import java.util.Scanner;

public class DeSzyfrCezara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst do zdekodowania:");
        char[] toDeCode = sc.next().toLowerCase().toCharArray();
        System.out.println("Podaj wartosc klucza do zdekodowania:");
        int keyToDeCode = sc.nextInt();

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v','w', 'x', 'y', 'z'};

        for (int i = 0; i < toDeCode.length; i++) {
            int letter = 0;
            for (int j = 0; j < letters.length; j++) {
                if(letters[j] == toDeCode[i]){
                    letter = j;
                    break;
                }
            }
            System.out.print(letters[(letter-keyToDeCode)%26]);
        }


    }
}
