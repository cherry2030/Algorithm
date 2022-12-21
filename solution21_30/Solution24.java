package daily_coding.solution21_30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution24 {
    // 이중 for문으로 값이 같은지 체크
    public static boolean isSubsetOf(int[] base, int[] sample) {
        if (base.length < sample.length) return false;
        int cnt = 0;
        for (int i = 0; i < sample.length; i++) {
            for (int j = 0; j < base.length; j++) {
                if (base[j] == sample[i]) {
                    cnt += 1;
                    break;
                }
            }
        }
        if (cnt == sample.length) {
            return true;
        } else {
            return false;
        }
    }

    // List의 contain() 메서드를 통해 값이 일치하는지 확인
    public static boolean isSubsetOf2(int[] base, int[] sample) {
        List<Integer> baseList = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!baseList.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
}
