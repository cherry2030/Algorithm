import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] computers) {
        // bfs로 순회하면서, 자기 자신 외에 연결된 노드가 없으면 answer + 1
        // 연결되어 있다면, 끝까지 순회한 다음에 answer + 1 
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                answer +=1;
                dfs(computers, i, n, visited);
            
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers, int i, int n, boolean[] visited){
        visited[i] = true;
        
        for(int j=0;j<n;j++){
            if(i!=j && computers[i][j] == 1 && visited[j] == false){
                dfs(computers, j, n, visited);
            }
        }
        
    }
}