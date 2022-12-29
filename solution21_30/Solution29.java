package daily_coding.solution21_30;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution29 {
    // naive solution
    public static int tiling(int num) {
        if(num<=2){
            return num;
        }
        return tiling(num-1) + tiling(num -2);
    }

    // memoization - O(N)
    public static int tiling2(int num) {
        // num이 1, 2인 경우를 초기화
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0,1,2));
        return aux(al,num);
    }

    public static int aux(ArrayList<Integer> al, int num){
        if(al.size() > num) return al.get(num); // memo에 존재한다면, 그 값을 가져온다.
        al.add(aux(al, num-1) + aux(al, num-2));
        return al.get(num);
    }


    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
    }
}
