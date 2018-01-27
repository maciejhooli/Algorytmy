package Zajecia2701.Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] matrix = {5, 4, 3, 2, 1};

        //Program z zajec
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length - 1; j++) { // matrix.length-1 -> ostatnia wartosc bedzie sie zamieniac z wartoscią następną
//                if (matrix[j] > matrix[j+1]) {
//                    int temp = matrix[j];
//                    matrix[j] = matrix[j+1];
//                    matrix[j+1] = temp;
//                }
//            }
//        }

        //Moj program - ale to nie jest sortowanie bąbelkowe:)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) { // matrix.length-1 -> ostatnia wartosc bedzie sie zamieniac z wartoscią następną
                if (matrix[i] < matrix[j]) {
                    int temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + ",");
        }
    }
}
