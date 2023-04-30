package daily_coding.Programmers;

public class 타겟넘버 {
    static int count=0;

    public static void main(String[] args) {
        solution(new int[]{4,1,2,1}, 4);
    }
    public static int solution(int[] numbers, int target) {
        // 모든 경우를 탐색해야하기 때문에 DFS를 사용하기로 했다.
        // 각 원소는 +/- 2가지 경우가 있다.
        dfs(numbers, 0, target, 0);
        return count;
    }
    public static void dfs(int[] numbers, int depth, int target, int result){
        // 1. 전체를 다 돌았을 때
        if(numbers.length == depth){
            // 1-1. 타겟과 같다면 count++
            if(target == result){
                count+=1;
            }
        }
        else {
            dfs(numbers, depth + 1, target, result + numbers[depth]);
            dfs(numbers, depth + 1, target, result - numbers[depth]);
        }
    }
}
