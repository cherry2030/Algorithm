package daily_coding.Coplit.solution21_30;

import java.util.HashMap;
import java.util.Stack;

public class Solution28 {
    public static boolean balancedBrackets(String str) {
        // Stack에는 여는 괄호만 넣음
        Stack<Character> stack = new Stack<>();
        String closer = ")}]";
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');


        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);

            if (hashMap.containsKey(curChar)) { // 여는 괄호인 경우, stack에 추가해준다.
                stack.push(curChar);
            } else if (closer.indexOf(curChar) != -1 && stack.size() > 0) { // 닫는 괄호이면서 stack에 여는 괄호가 있는 경우
                char top = stack.pop();
                if (hashMap.get(top) != curChar) { // 짝이 맞는 괄호인지 확인
                    return false;
                }
            }
            else{ // 그 외의 경우(스택이 비어있고, 현재 문자열이 괄호의 뒷부분인 경우)
                return false;
            }
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        boolean output = balancedBrackets("())()(()");
        System.out.println(output); // // -> false

        output = balancedBrackets("()");
        System.out.println(output); // --> true
    }
}
