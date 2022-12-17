package daily_coding.solution11_20;

public class Solution17 {
    // 최대 소수점 둘째 짜리까지 구한 수를 문자열로 변환하여 출력합니다. (소수점 셋째 자리에서 반올림)
    // sqrt 사용 금지

    // 방법 1
    public static String computeSquareRoot(int num) {
        double sqrtNum = 1;
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};

        for (int i = 0; i < diffs.length; i++) {
            while (sqrtNum * sqrtNum < num) {
                sqrtNum += diffs[i];
            }
            if (sqrtNum * sqrtNum == num) {
                return String.format("%.2f", sqrtNum);
            }
            if (sqrtNum * sqrtNum > num) {
                sqrtNum -= diffs[i];
            }
        }

        return String.format("%.2f", sqrtNum);
    }

    // 방법 2 - 바빌로니아 법 사용
    // 바빌로니아 법은 x가 무한으로 갈수록, 점차 값에 수렴한다는 것!
    // 하지만 우리는 무한 루프를 돌 수 없기 때문에, 정밀도를 설정해야 한다.
    public static String computeSquareRoot2(int num) {
        double x = 1;
        double compare = (double) num;
        double precision = 0.0001;
        while(!(compare-precision < x*x && x*x < compare + precision)){
            if(x*x == num){
                break;
            }
            x = (x + (num/x)) /2;
        }
        return String.format("%.2f", x);
    }

    public static void main(String[] args) {
        String output = computeSquareRoot2(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot2(6);
        System.out.println(output); // --> "2.45"
    }
}
