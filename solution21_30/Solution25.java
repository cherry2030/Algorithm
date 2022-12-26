package daily_coding.solution21_30;

public class Solution25 {
    // O(N) - for문을 통해서 exponent번 곱하기
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

        while (exponent > 0)
        {
            if((exponent & 1) != 0){
                result *= base;
            }

            base *= base;
            exponent >>= 1;
        }

        return result;
    }

    // O(log N) - 재귀
    public static long power3(int base, int exponent) {
        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power3(base, half);
        long result = (temp * temp);

        if(exponent % 2 == 1) return (base * result);
        else return result;
    }

    public static void main(String[] args) {
        long output = power2(3, 6);
        System.out.println(output); // --> 19334827
    }
}
