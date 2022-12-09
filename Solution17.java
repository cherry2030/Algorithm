package daily_coding;

public class Solution17 {
    // 최대 소수점 둘째 짜리까지 구한 수를 문자열로 변환하여 출력합니다. (소수점 셋째 자리에서 반올림)
    // sqrt 사용 금지

    public static String computeSquareRoot(int num) {
        double sqrtNum = 1;
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};

        for (int i = 0; i < diffs.length; i++) {
            while (sqrtNum * sqrtNum < num) {
                sqrtNum += diffs[i];
                if (sqrtNum * sqrtNum == num) {
                    return String.format("%.2f", sqrtNum);
                }
                if (sqrtNum * sqrtNum > num) {
                    sqrtNum -= diffs[i];
                    break;
                }
            }
        }

        return String.format("%.2f", sqrtNum);
    }

    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }
}
