package daily_coding.solution21_30;

import java.util.ArrayList;

public class Solution23 {
    // naive solution: O(2^N)
    public static int fibonacci(int num) {
        if(num<=1) return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }

    // dynamic with tabulation: O(N) - 재귀 x
    public static int fibonacci2(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        for(int i=2;i<=num;i++){
            al.add(al.get(i-1) + al.get(i-2));
        }
        return al.get(num);
    }

    // dynamic with memoization: O(N) - 재귀 o
    public static int fibonacci3(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);

        return aux(al, num);
    }
    public static int aux(ArrayList<Integer> memo, int num){ // 재귀
        if(memo.size() <= num){
            memo.add(aux(memo, num-2) + aux(memo, num-1));
        }
        return memo.get(num);
    }

    public static void main(String[] args) {
        int output = fibonacci3(0);
        System.out.println(output); // --> 0

        output = fibonacci3(1);
        System.out.println(output); // --> 1

        output = fibonacci3(5);
        System.out.println(output); // --> 5

        output = fibonacci3(9);
        System.out.println(output); // --> 34
    }
}
