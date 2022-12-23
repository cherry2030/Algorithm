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
            if((exponent & 1) != 0){ //  m이 짝수이면 0이므로 False이고, n이 홀수이면 1이어서 True
                // 왜 & 1이 짝수, 홀수를 구분짓는지가 궁금했는데
                // & 1 시에, 모든 자릿수에 1을 and 연산자 하는 것이 아니라 일의 자리에만 비트연산을 수행한다.
                // ex) 5(101) & 1 -> 1, 0, 1에 1을 모두 and 연산하는 것이 아니라 일의 자리인 1과 1만 연산
                // 즉 홀수는 항상 마지막 비트가 1이므로 이것은 홀수 짝수를 구분짓는 문법이다.
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
