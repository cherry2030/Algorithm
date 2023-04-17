package daily_coding.Coplit.solution11_20;

import java.util.HashMap;
import java.util.Map;

public class Solution16 {
    public static boolean isIsogram(String str) {
        if(str.length()==0) return true;
        // 대소문자 구분하지 않음 -> 통일하기
        str = str.toLowerCase();
        Map<String, Integer> iso = new HashMap<>();
        for(int i=0;i<str.length();i++){
            String cur = String.valueOf(str.charAt(i));
            if(!iso.containsKey(cur)){
                iso.put(cur, 0);
            }
            iso.put(cur, iso.get(cur)+1);
        }
        for(String key : iso.keySet()){
            if(iso.get(key) > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
}
