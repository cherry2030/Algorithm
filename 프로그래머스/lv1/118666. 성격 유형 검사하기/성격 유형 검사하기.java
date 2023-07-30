// 단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단

// 1번 지표	라이언형(R), 튜브형(T)
// 2번 지표	콘형(C), 프로도형(F)
// 3번 지표	제이지형(J), 무지형(M)
// 4번 지표	어피치형(A), 네오형(N)

// 1-3: 앞의 것 점수(3,2,1)
// 4 - 0
// 5-7: 뒤의 것 점수(1,2,3)

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = {0,3,2,1,0,1,2,3};
        
        // 지표에 점수 추가
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        // System.out.println(map.get("C"));
        
        for(int i=0;i<survey.length;i++){
            String t1 = survey[i].charAt(0)+"";
            String t2 = survey[i].charAt(1)+"";
            
            int s = score[choices[i]]; // 5
            
            if(choices[i] <= 3){ // t1에 점수 추가
                // System.out.println(map.get(t1));
                map.put(t1, map.get(t1)+ s);
            }
            if(choices[i] == 4){
                continue;
            }
            if(choices[i] >= 5){ // t2에 점수 추가
                map.put(t2, map.get(t2)+s);
            }
        }
        
        if(map.get("R") < map.get("T")){
            answer+= "T";
        }
        else{
            answer+= "R";
        }
        
        if(map.get("C") < map.get("F")){
            answer+= "F";
        }
        else{
            answer+= "C";
        }
        
        if(map.get("J") < map.get("M")){
            answer+= "M";
        }
        else{
            answer+= "J";
        }
        
        if(map.get("A") < map.get("N")){
            answer+= "N";
        }
        else{
            answer+= "A";
        }
        
        return answer;
    }
}