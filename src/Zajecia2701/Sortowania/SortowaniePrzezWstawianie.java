package Zajecia2701.Sortowania;

public class SortowaniePrzezWstawianie {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};

        for (int i = arr.length-2; i >= 0; i--) {
            int temp = arr[i];
            int j = i + 1;
            while ((j < arr.length) && (temp > arr[j])) {
                arr[j-1] = arr[j];
                j++;
            }
            arr[j - 1] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}