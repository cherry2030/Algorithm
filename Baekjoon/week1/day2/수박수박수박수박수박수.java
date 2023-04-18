package daily_coding.Baekjoon.week1.day2;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String result = "";
        int k=0;
        for(int i=0;i< n/2;i++){
            result += "수박";
            k++;
        }
        if(n- 2*k == 1){
            result+="수";
        }
        return result;
    }
}
