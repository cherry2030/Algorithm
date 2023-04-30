package daily_coding.Baekjoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소트인사이드{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();

        // 1. 입력받은 string을 int[] 배열로 변환
        int n = s.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.charAt(i) - '0';
        }

        int maxIndex = 0;
        int tmp;

        // 2. 내림차순으로 배열 정렬 - 선택정렬
        for(int i=0;i< n-1;i++){
            maxIndex = i;
            for(int j=i+1;j< n;j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            // swap
            tmp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = tmp;
        }

        // 3. 배열 출력
        for(int i=0;i< len;i++){
            System.out.print(arr[i]);
        }
    }
}