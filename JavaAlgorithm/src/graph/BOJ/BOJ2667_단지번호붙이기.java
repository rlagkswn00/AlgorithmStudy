package graph.BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ2667_단지번호붙이기 {
    static int N, cnt;
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<Integer> answer;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        //	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));	//	파일로부터 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N + 2][N + 2];
        for(int i = 1; i<= N ; i++){
            String line = br.readLine();
            for(int j = 0; j < N ; j++){
                arr[i][j+1] = line.charAt(j) - '0';
            }
        }

        answer = new ArrayList<>();
        visited = new boolean[N + 2][N + 2];
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    int ret = bfs(new Pos(i, j));
                    answer.add(ret);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        answer.sort(null);
        sb.append(answer.size()).append("\n");
        for (int a :
                answer) {
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }

    static int bfs(Pos p){
        int count = 0;

        visited[p.x][p.y] = true;
        count++;

        Queue<Pos> q = new LinkedList<>();
        q.add(p);

        while (!q.isEmpty()) {
            Pos cPos = q.poll();

            for (int k = 0; k < 4; k++) {
                int nx = cPos.x + dx[k];
                int ny = cPos.y + dy[k];
                if(visited[nx][ny])
                    continue;
                if(arr[nx][ny] == 0)
                    continue;
                q.add(new Pos(nx, ny));
                visited[nx][ny] = true;
                count++;
            }
        }
        return count;
    }
    static class Pos{
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
