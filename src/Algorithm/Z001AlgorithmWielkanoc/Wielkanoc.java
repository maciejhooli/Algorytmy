package Algorithm.Z001AlgorithmWielkanoc;

import java.util.Scanner;

public class Wielkanoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj rok:");
        int userYear = sc.nextInt();

        int a = userYear%19;
        int b = Math.floorDiv(userYear, 100);
        int c = userYear%100;
        int d = Math.floorDiv(b, 4);
        int e = b % 4;
        int f = Math.floorDiv((b+8), 25);
        int g = Math.floorDiv(b-f+1, 3);
        int h = (19*a + b - d - g + 15)%30;
        int i = Math.floorDiv(c, 4);
        int k = c%4;
        int l = (32+2*e+2*i-h-k)%7;
        int m = Math.floorDiv((a+11*h+22*l),451);
        int p = (h+l-7*m+114)%31;

        int dayWielk = p+1;
        int monthWielk = Math.floorDiv(h+l-7*m+114, 31);

        System.out.printf("%d/%d/%d\n", dayWielk, monthWielk, userYear);
    }
}
