package daily_coding.Coplit.solution21_30;

public class Solution30 {
    // O(log N) - 이진 탐색
    public static int rotatedArraySearch(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (rotated[mid] == target) {
                return mid;
            }

            if (rotated[mid] > rotated[left]) { // 왼쪽 반절이 정렬되어 있는 상태
                if(target < rotated[mid] && target >=rotated[left]){ // target이 정렬되어 있는 왼쪽 반절에 포함되는 경우
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{ // 오른쪽 반절이 정렬되어 있는 상태
                if (rotated[mid] < target && target <=rotated[right]) {// target이 정렬되어 있는 오른쪽 반절에 포함되는 경우
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int output = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        int output2 = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output2); // --> -1
    }
}
