package daily_coding.solution21_30;

import java.util.Arrays;

public class Solution22 {
    public static int[] bubbleSort(int[] arr) {
        int tmp;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isSwapped = true;
                }
            }
            if(isSwapped==false) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{1, 2, 43, 100, 100, 21});
        System.out.println(Arrays.toString(output));
    }
}
