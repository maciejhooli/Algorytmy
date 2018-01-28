package Zajecia2701.Sortowania;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] tab = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};//{5, 5, 3, 8, 1, 2, 4, 4, 3};

        int[] tabZlicz = new int[findMax(tab) + 1];

        for (int i = 0; i < tab.length; i++) {
            tabZlicz[tab[i]]++;
        }

        for (int i = 0; i < tabZlicz.length; i++) {
            for (int j = 0; j < tabZlicz[i]; j++) {
                System.out.print(i + ", ");
            }
        }
    }

    public static int findMax(int[] tab) {
        int max = -1;
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }
}
