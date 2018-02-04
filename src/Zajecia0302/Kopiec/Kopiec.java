package Zajecia0302.Kopiec;

public class Kopiec {

    //TODO WYPISAć WZORY Z PREZENTACJI Z OZNACZENIAMI
    private int[] tab = new int[15]; //wartość stała na potrzeby zajęć
    private int n = 0; //rozmiar bieżący kopca

    public void addElementToKopiec(int element) {
        int i = n; //ustawienie indeksu na pozycje wstawianego elementu
        n++;
        int j = Math.floorDiv(i - 1, 2); //indeks rodzica

        while (i > 0 && tab[j] < element) {
            tab[i] = tab[j]; //umieszczenie rodzica na miejscu syna
            i = j; //przenosimy się na pozcyję ojca
            j = Math.floorDiv(i - 1, 2); //obliczamy nowy indeks ojca
        }
        tab[i] = element;
    }

    public int removeElementFromKopiec() {
        if (n != 0) {
            int root = tab[0];
            n = n - 1;
            int v = tab[n];
            int i = 0;
            int j = 1;

            while (j < n) {
                if ((j + 1 < n) && (tab[j + 1] > tab[j])) {
                    j = j + 1;
                }
                if (v >= tab[j])
                    break;
                tab[i] = tab[j];
                i = j;
                j = 2 * j + 1;
            }
            tab[i] = v;
            return root;
        } return -1;

    }


    public void clearHeap(){
        int[] sortedTab = new int[n];
        for (int i = n-1; i >= 0; i--) {
            sortedTab[i] = removeElementFromKopiec();
        }

        for (int i = 0; i < sortedTab.length; i++) {
            System.out.println(sortedTab[i]);
        }
    }

    public void printAll() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: %d\n", i, tab[i]);
        }

    }
}
