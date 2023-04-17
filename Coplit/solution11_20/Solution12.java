package daily_coding.Coplit.solution11_20;

import java.util.Arrays;
//public static int[] reverseArr(int[] arr){
//        // 탈출 조건
//        if(arr.length==0) return new int[]{};
//
//        //head
//        int head[] = Arrays.copyOfRange(arr,arr.length-1,arr.length);
//        int tail[] = Arrays.copyOfRange(arr,0,arr.length-1);
//
//        int result[] = reverseArr(tail);
//
//        // head, result 순으로 합치기
//        int merge[] = new int[result.length + head.length];
//        System.arraycopy(head,0,merge,0,1);
//        System.arraycopy(result,0,merge,1,result.length);
//
//
//        return merge;
//        }

public class Solution12 {
    public static int[] reverseArr(int[] arr) {
        // 탈출 조건
        if (arr.length == 0) return new int[]{};

        //head
        int head[] = Arrays.copyOfRange(arr, 0, 1);
        int tail[] = Arrays.copyOfRange(arr, 1, arr.length);

        int result[] = reverseArr(tail);

        // result, head 순으로 합치기
        int merge[] = new int[result.length + head.length];
        System.arraycopy(result, 0, merge, 0, result.length);
        System.out.println(Arrays.toString(merge));
        System.arraycopy(head, 0, merge, result.length, 1);
        System.out.println(Arrays.toString(merge));
        return merge;
    }

    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
}