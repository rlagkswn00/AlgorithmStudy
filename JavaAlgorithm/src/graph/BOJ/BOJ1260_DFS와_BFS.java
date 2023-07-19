package graph.BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260_DFS와_BFS {
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();
    static int[][] adjM;
    static boolean[] visited;
    static ArrayList<Integer>[] adjL;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));	//	파일로부터 읽기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adjM = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        adjL = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++)
            adjL[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            adjL[s].add(e);
            adjL[e].add(s);
        }
        //인접리스트 사용 시 정렬 필요(작은 노드부터)
        for (int i = 1; i <= N; i++) {
            Collections.sort(adjL[i]);
        }
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            adjM[s][e] = adjM[e][s] = 1;
//        }
        dfs(V);
        sb.append("\n");
        bfs(V);
        System.out.println(sb);
    }

    //인접 리스트
    private static void dfs(int n) {
//        [0] 방문표시, 처음 방문시 해야할 일 있으면 여기서!
        visited[n] = true;
        sb.append(n).append(" ");

        //[1] 방향 처리
        for (int j : adjL[n]) {
            if (!visited[j]) dfs(j);
        }
    }

//    인접 배열
//    private static void dfs(int n) {
//        //[0] 방문표시, 처음 방문시 해야할 일 있으면 여기서!
//        visited[n] = true;
//        sb.append(n).append(" ");
//
//        //[1] 방향 처리
//        for (int j = 1; j <= N; j++) {
//            if(adjM[n][j] == 1 && !visited[j]){
//                dfs(j);
//            }
//        }
//    }

    private static void bfs(int s) {
        //[0] Q, v[], 필요한 플래그 등 생성
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[N + 1];

        //[1] Q에 초기데이터(들) 삽입, v[] 표시, 필요 시 정답 처리
        q.add(s);
        visited[s] = true;
        sb.append(s).append(" ");

        //[2] Q에 데이터 있는 동안 반복 처리
        while (!q.isEmpty()) {
            int c = q.poll();        //큐에서 데이터 꺼냄
                                    //정답처리
            for (int j : adjL[c]) { // 연결된 노드 조건에 맞으면 큐에 삽임
                if(!visited[j]){
                    q.add(j);
                    visited[j] = true;
                    sb.append(j).append(" ");
                }
            }
        }

    }
}