package PracaDomowa0302;

public class ZD01ZmienneTablice {
    public static void main(String[] args) {
        int[] givenMatrix = {3,7,2,8,4,9,5,6,4,9};

        int indexFirst = 0;
        int indexSecond = 0;
        int temp = -1;
        boolean foundSecond = false;

        for (int i = 0; i < givenMatrix.length; i++) {
            temp = givenMatrix[i];
            indexFirst = i;
            for (int j = indexFirst + 1; j < givenMatrix.length; j++) {
                if (temp == givenMatrix[j]){
                    indexSecond=j;
                    foundSecond = true;
                    break;
                }
            }
            if(foundSecond){
                break;
            }
        }

        System.out.printf("Number:= %d. \n", givenMatrix[indexFirst]);
        System.out.printf("IndexFirst:= %d. \n", indexFirst);
        System.out.printf("IndexSecond:= %d. \n", indexSecond);


    }

//    public static int maxValue(int[] matrix) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < matrix.length; i++) {
//            max = (max < matrix[i]) ? matrix[i] : max;
//        }
//        return max;
//    }
}
