package daily_coding.solution11_20;

import java.util.Arrays;

public class Solution11 {
    public static String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length==0) return null;
        int maxIndex=0;
        int minIndex=0;
        int max=0;
        int min=20;
        int index=0;

        String[] result = new String[arr.length-2];
        for(int i=0;i<arr.length;i++){
            if(max <= arr[i].length()){
                max = arr[i].length();
                maxIndex = i;
            }
            if(min >= arr[i].length()){
                min = arr[i].length();
                minIndex = i;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i==maxIndex || i==minIndex){
                continue;
            }
            result[index++] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
    }
}
