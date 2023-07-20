package Graph.BOJ;

import java.io.*;
import java.util.*;

public class BOJ1325_효율적인_해킹 {
    static int N, M;
    static int[] answerArr;
    static boolean[] visited;
    static ArrayList<Integer>[] adjL;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adjL = new ArrayList[N+1];
        answerArr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            adjL[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            adjL[s].add(e);
        }

        //로직
        for(int i = 1 ; i <= N ;i++){
            bfs(i);
        }

        StringBuilder sb = new StringBuilder();

        int maxVal = 0;
        for(int i = 1 ; i <= N ;i++){
            maxVal = Math.max(maxVal, answerArr[i]);
        }

        for(int i = 1 ; i <= N ;i++){
            if(maxVal == answerArr[i])
                sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    private static void dfs(int n,int start) {
        visited[n] = true;
        answerArr[start]++;
        for (int j : adjL[n]) {
            if(!visited[j]){
                dfs(j,start);
            }
        }
    }

    private static void bfs(int n){
        visited = new boolean[N+1];
        visited[n] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        while(!q.isEmpty()){
            int c = q.poll();
            for (int j : adjL[c]) {
                if(!visited[j]){
                    q.add(j);
                    visited[j] = true;
                    answerArr[j]++;
                }
            }
        }
    }
}
