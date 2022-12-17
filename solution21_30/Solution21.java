package daily_coding.solution21_30;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution21 {
    public static int largestProductOfThree(int[] arr) {
        int max1=0;
        int max2= 0;
        int len = arr.length;
        Arrays.sort(arr);
        max1 = arr[len-1] * arr[len-2] * arr[len-3];
        max2 = arr[len-1] * arr[0] * arr[1];

        return Math.max(max1,max2);
    }

    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }
}
