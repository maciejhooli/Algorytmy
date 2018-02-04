package PracaDomowa2701;

public class ZD03Dominant {
    public static void main(String[] args) {
        int[] t = {4, 4, 3, 4, 4, 2, 6, 5, 5, 5};
        int[] l = new int[maxVal(t)[0] + 1];

        for (int i = 0; i < t.length; i++) {
                    l[t[i]]++;
        }

        System.out.printf("Wartosc wystepujaca najczesciej: %d. Wystapila %d razy", maxVal(l)[1], maxVal(l)[0]);
    }

    public static int[] maxVal(int[] table) {
        int[] max = {0, 0};
        for (int i = 0; i < table.length; i++) {
            if (max[0] < table[i]) {
                max[0] = table[i];
                max[1] = i;
            }
        }
        return max;
    }
}
