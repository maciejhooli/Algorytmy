package Zajecia2701;

public class SilniaDemo {
    public static void main(String[] args) {
        int silniaResult = silnia(4);
        System.out.println(silniaResult);

        System.out.printf("Dziesiątki: %d\nJednosci: %d\n", (silniaResult-silniaResult%10)/10, silniaResult%10);

    }

    public static int silnia(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }
}
