package daily_coding.Coplit.solution31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution31 {
    public static ArrayList<String> powerSet(String str) {
        // 중복 제거
        String uniqueStr = "";
        for(int i=0;i<str.length();i++){
            if(uniqueStr.indexOf(str.charAt(i)) == -1){ // 문자가 존재하지 않을 때
                uniqueStr+= str.charAt(i);
            }
        }

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(uniqueStr.split("")));
        Collections.sort(arr); // 알파벳 순서로 정렬
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        result.addAll(arr);

        // 조합
        for(int i=2;i<=str.length();i++){
            // combination 적용
        }

        // 오름차순으로 정렬
        Collections.sort(result);
        return result;
    }


    public String deduplicated(String str) {
        String result = "";
        //indexOf 메서드를 통해 중복여부를 확인합니다.
        for(int index = 0; index < str.length(); index++) {
            if(str.indexOf(str.charAt(index)) == index) {
                result += str.charAt(index);
            }
        }

        String[] sorted = result.split("");
        Arrays.sort(sorted);
        result = String.join(",", sorted).replaceAll(",", "");
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }
}
