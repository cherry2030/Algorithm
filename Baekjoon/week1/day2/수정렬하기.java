package daily_coding.Baekjoon.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] numbers = new Integer[n];
        for(int i=0;i<n;i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        // 오름차순 정렬
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(numbers[i]+"\n");
        }
        System.out.println(sb.toString());
    }
}
