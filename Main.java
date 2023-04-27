package daily_coding;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,3,2,1}));
    }
    public static int[] solution(int[] arr) {
        double[] failRates = new double[]{0.5, 0.3, 1};
        Double[] newArray = Arrays.stream(failRates).boxed().toArray(Double[]::new);
        Arrays.sort(newArray, Collections.reverseOrder());
        for(double a: newArray){
            System.out.println(a);
        }

        return arr;
//        if(arr.length == 1) return new int[]{-1};
//        int min = Arrays.stream(arr).min().getAsInt();
//
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        list.remove(min);
//        return list.stream().mapToInt(i -> i).toArray();


    }
}