package daily_coding.solution21_30;

public class Solution29 {
    // naive solution
    public static int tiling(int num) {
        if(num<=2){
            return num;
        }
        return tiling(num-1) + tiling(num -2);
    }

    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
    }
}
