package ZbiorZadan.Z006DniTygodnia;

import java.util.Scanner;
//TODO Do skonczenia
public class DniTygodnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeekDays daysNames = WeekDays.Pn;

        char[] userInput = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int shift = 0;

        for (int i = 0; i < userInput.length; i++) {
            if(Character.isLetter(userInput[i])) {
                sb.append(userInput[i]);
            }
            else if (Character.isDigit(userInput[i])){
                shift = Integer.parseInt(Character.toString(userInput[i]));
            }
        }

//        System.out.println(WeekDays.valueOf(sb.toString()));
//        System.out.println(shift);




    }
}
