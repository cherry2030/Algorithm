package daily_coding.solution11_20;

public class Solution20 {
    // 방법 1
    public static String compressString(String str) {
        int cnt;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            cnt = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (c == str.charAt(j)) cnt += 1;
                else break;
            }
            if (cnt >= 3) {
                result += cnt;
                result += c;
                i += (cnt - 1);
            } else {
                result += c;
            }
        }
        return result;
    }

    // 방법 2
    public static String compressString2(String str) {
        char before = str.charAt(0);
        int cnt = 1;
        String result = "";

        str+= " ";
        for(int i=1;i<str.length();i++){
            if(before == str.charAt(i)){
                cnt+=1;
            }
            else{ // 다른 문자를 마주친다면
                if(cnt>=3){
                    result += cnt;
                    result += before;
                }
                else{
                    result+= String.valueOf(before).repeat(cnt);
                }
                before = str.charAt(i);
                cnt=1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String output = compressString2("abc");
        System.out.println(output); // --> "abc"

        output = compressString2("dsafdasfffffsgaaaaabbbscccdd");
        System.out.println(output); // --> "3wggoppo4p"
    }
}
