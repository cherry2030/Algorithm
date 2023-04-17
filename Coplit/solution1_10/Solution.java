package daily_coding.Coplit.solution1_10;

import java.util.Arrays;

public class Solution {
    public static String letterCapitalize(String str) {
        if(str.length()==0) return "";
        String[] words= str.split(" ");
        String result="";
        System.out.println(Arrays.toString(words));

        for(int i =0;i<words.length;i++){
            if(words[i].length()==0){ // 빈 배열인 경우 - 공백이 연속이여서
                continue;
            }
            words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
        }

        System.out.println(Arrays.toString(words));
        result = String.join(" ", words);

        return result;
    }

    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"

    }
}
