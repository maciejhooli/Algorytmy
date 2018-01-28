package ZbiorZadan.Z002CamelCase;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userText = sc.nextLine().toCharArray();

        for (int i = 0; i < userText.length; i++) {
            userText[i] = polishAlphabetTranslation(userText[i]);
            if(i%2 == 0){
                userText[i] = Character.toUpperCase(userText[i]);
            }
            System.out.print(userText[i]);
        }
    }


    public static char polishAlphabetTranslation(char sign) {
        char result = ' ';
        switch (sign) {
            case 'ą':
                result = 'a';
                break;
            case 'ć':
                result = 'c';
                break;
            case 'ę':
                result = 'e';
                break;
            case 'ł':
                result = 'l';
                break;
            case 'ó':
                result = 'o';
                break;
            case 'ś':
                result = 's';
                break;
            case 'ż':
            case 'ź':
                result = 'z';
                break;
            default:
                result = sign;
        }
        return result;
    }
}
