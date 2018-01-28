package Zajecia2701.Sortowania;

public class SortowaniePrzezZliczanieKluczWartosci {
    public static void main(String[] args) {
        // Część 1:
        char[] pattern = {'A', 'B', 'C'};
        String[] array = new String[27];
        String[] input = {"CAC", "CAA", "AAB", "BAB", "CAC"};
        int counter = 0;

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                for (int k = 0; k < pattern.length; k++) {
                    array[counter] = String.valueOf(pattern[i]).concat(String.valueOf(pattern[j])).concat(String.valueOf(pattern[k]));
                    counter++;
                }
            }
        }

        //Część 2:
        int[] sortIndex = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (input[i].equals(array[j])) {
                    sortIndex[i] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < sortIndex.length; j++) {
                if(i == sortIndex[j]){
                    System.out.println(array[i]);
                }
            }

        }
    }
}
