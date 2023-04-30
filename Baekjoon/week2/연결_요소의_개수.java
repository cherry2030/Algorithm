package daily_coding.Baekjoon.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 연결_요소의_개수{
    public static int count = 0; // 연결 요소의 수
    public static int[][] arr;   // 인접 행렬
    public static boolean[] visited;
    public static int E; // 정점 수
    public static int V; // 간선 수

    public static void main(String args[]) throws IOException {
        // 0. 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        E = Integer.parseInt(s[0]);
        V = Integer.parseInt(s[1]);

        // 인접 행렬 생성
        // 1부터 넣기 위해서 e+1 만큼의 2차원 배열을 생성한다.
        arr = new int[E+1][E+1];

        // visited 초기화
        visited = new boolean[E+1];

        for(int i=0;i<V;i++){
            s = br.readLine().split(" ");
            int e1 = Integer.parseInt(s[0]);
            int e2 = Integer.parseInt(s[1]);
            arr[e1][e2] = arr[e2][e1] = 1;
        }

        // DFS로 풀이
        // 모든 정점이 시작점이 된다.
        for(int i=1;i<=E;i++){
            if(visited[i] == false){
                // 한번 dfs를 돌고나면 count++
                dfs(i);
                count++;
            }
        }

        System.out.print(count);
    }

    public static void dfs(int start){
        visited[start] = true;

        // 더 이상 인접한 노드가 없거나 모두 들린 경우에 탈출
        for(int i=1;i<=E;i++){
            if(arr[start][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }
}