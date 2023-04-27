package daily_coding;

import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 로봇의 이동 방향을 저장하는 해시맵
        HashMap<Character, int[]> DIR = new HashMap<Character, int[]>() {{
            put('N', new int[]{-1, 0});
            put('S', new int[]{1, 0});
            put('W', new int[]{0, -1});
            put('E', new int[]{0, 1});
        }};
        // 공원의 크기를 저장
        int R = park.length;
        int C = park[0].length();

        // 우리 강이지 어디있오??
        int sR = 0, sC = 0;
        for (int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if (park[r].charAt(c) == 'S') {
                    sR = r;
                    sC = c;
                    break;
                }
            }
        }

        // 로봇의 현재 위치를 초기화
        int r = sR, c = sC;

        // 명령을 수행하며 로봇의 위치를 이동
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            char op = route[0].charAt(0);
            int n = Integer.parseInt(route[1]);
            int[] dir = DIR.get(op);
            int nR = r + dir[0] * n;
            int nC = c + dir[1] * n;

            // 이동할 위치가 유효하고 장애물이 없으면 이동
            if (isValid(nR, nC, R, C) && isClear(park, r, c, dir[0], dir[1], n)) {
                r = nR;
                c = nC;
            }
        }

        // 최종 위치를 배열로 반환
        return new int[]{r, c};
    }

    // 위치가 유효한지 확인하는 메서드
    private boolean isValid(int r, int c, int R, int C) {
        return 0 <= r && r < R && 0 <= c && c < C;
    }

    // 이동 중 장애물이 있는지 확인하는 메서드
    private boolean isClear(String[] park, int r, int c, int dR, int dC, int n) {
        while(n > 0) {
            r += dR;
            c += dC;
            if (park[r].charAt(c) == 'X') {
                return false;
            }
            n--;
        }
        return true;
    }
}
//public class Solution {
//    public static int[] solution(String[] id_list, String[] report, int k) {
//
//        // 모든 사용자 정보가 id_list에 존재
//        // 0.
//        Map<String, Integer> reported = new HashMap<>();
//        Map<String, Set<String>> reporter = new HashMap<>();
//
//        for(String id: id_list){
//            reported.put(id, 0);
//            reporter.put(id, new HashSet<>());
//        }
//
//        // 1.
//        for(int i=0;i< report.length;i++){
//            String[] p = report[i].split(" ");
//            String src = p[0];
//            String dst = p[1];
//            reported.put(dst, reported.get(dst)+1);
//            reporter.get(src).add(dst);
//        }
//
//        int[] answer = new int[id_list.length];
//        for(int i=0;i< id_list.length;i++){
//            String id = id_list[i];
//            int count = 0;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        int[] result = solution(new String[]{"muzi", "frodo", "apeach", "neo"}, {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2);
//    }
//}
