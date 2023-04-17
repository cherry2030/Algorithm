package daily_coding.Baekjoon.week1.day1;

import java.io.*;

public class 숫자의합 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split("");
        int result = 0;

        for(String s: num){
            result+= Integer.parseInt(s);
        }
        bw.write(result+"");
        bw.close();
    }
}
