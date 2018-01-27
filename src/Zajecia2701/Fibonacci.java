package Zajecia2701;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibValue = sc.nextInt();

        System.out.printf("Wynik dla %d wynosi: %d \n", fibValue, fib(fibValue));
    }

    public static int fib(int n){
        if (n== 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}
