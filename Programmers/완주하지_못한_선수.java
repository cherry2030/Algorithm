package daily_coding.Programmers;

import java.util.HashMap;

class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        // 0. HashMap에 participant 저장
        // -> 중복이 존재하면 count ++ 해준다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: participant){
            if(!map.containsKey(s)){ // map에 저장되지 않았다면
                map.put(s, 1);
            }
            else{ // 이미 map에 저장되었다면
                map.put(s, map.get(s) + 1);
            }
        }

        // 1. completion를 돌면서, map에 존재하는지 확인
        // 1-1. map에 존재하고 value가 1이면 삭제, 존재하지 않는다면 return
        // 1-2. map에 존재하지만 value가 2 이상이라면 -1 해주기
        for(String cp: completion){
            if(!map.containsKey(cp)){
                return cp;
            }
            else{ // map에 존재하는 경우
                if(map.get(cp) >=2){
                    map.put(cp, map.get(cp)-1);
                }
                else{
                    map.remove(cp);
                }
            }
        }

        String result = "";
        // 2. 이름이 중복되는 경우에는 다 돌고 map에 남은 하나의 key값 return
        for(String key: map.keySet()){
            result = key;
        }
        return result;
    }
}
