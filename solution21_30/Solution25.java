package daily_coding.solution21_30;

public class Solution25 {
    // O(N) - for문을 통해서 exponent 번 곱하기
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
            result %= 94906249;
        }
        return result;
    }

    // O(log N)
    public static long power2(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
            result %= 94906249;
        }
        return result;
    }

    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
    }
}
