package daily_coding.solution11_20;

public class Solution20 {
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

    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
}
