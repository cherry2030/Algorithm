package daily_coding.Baekjoon.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[n];
        double result=0;

        for(int i=0;i<n;i++){
            scores[i] = Double.parseDouble(st.nextToken());
            result+=scores[i];
        }

        // 최댓값 구하기
        double max = Arrays.stream(scores).max().orElse(0);
        result = (result * 100) / (n * max);
        System.out.println(result);
    }
}
