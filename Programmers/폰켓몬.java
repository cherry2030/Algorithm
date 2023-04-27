package daily_coding.Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class 폰켓몬 {
    public int solution(int[] nums) {
        // 0. 골라야하는 수 = chooseSize
        int chooseSize = nums.length / 2;

        // 1. 배열의 중복 제거 int[] -> HashSet
        Set<Integer> numbers = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));

        // 1-1. 중복을 제거했을 때의 종류 = type
        int type = numbers.size();

        // 2. 중복을 제거한 수 > 골라야하는 수 -> return chooseSize;
        if(type > chooseSize){
            return chooseSize;
        }
        else{
            return type;
        }
    }
}