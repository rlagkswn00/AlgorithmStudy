package Graph.BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_미로_탐색 {
    static int N;
    static int M;
    static boolean[][] visited;
    static String[] board;
    static int answer = Integer.MAX_VALUE;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));    //	파일로부터 읽기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1][M + 1];
        board = new String[N + 1];

        for (int i = 1; i < N + 1; i++)
            board[i] = br.readLine();

//        dfs(1, 1, 1);
        bfs(1, 1);
        System.out.println(bfs(1,1));
    }

    static class Pos {
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }

    private static int bfs(int x, int y) {
        Queue<Pos> q = new LinkedList();
        int[][] ans = new int[N+1][M+1];

        //초기 값
        q.add(new Pos(x, y));
        ans[1][1] = 1;

        while (!q.isEmpty()) {
            Pos nPos = q.poll();
            if(nPos.x == N && nPos.y == M)
                return ans[nPos.x][nPos.y];
            for (int i = 0; i < 4; i++) {
                int nx = nPos.x + dx[i];
                int ny = nPos.y + dy[i];
                if (nx <= 0 || ny <= 0 || nx > N || ny > M)
                    continue;
                if (ans[nx][ny] > 0)
                    continue;
                char n = board[nx].toCharArray()[ny - 1];
                if (n == '0')
                    continue;
                q.add(new Pos(nx, ny));
                visited[nx][ny] = true;
                ans[nx][ny] = ans[nPos.x][nPos.y] + 1;
            }
        }
        return -1;
    }

    private static void dfs(int x, int y, int ans) {
        //방문표시
        if (ans > answer)
            return;
        if (x == N && y == M) {
            answer = Math.min(ans, answer);
            return;
        }
        visited[x][y] = true;


        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx <= 0 || ny <= 0 || nx > N || ny > M)
                continue;
            char n = board[nx].toCharArray()[ny - 1];
            if (visited[nx][ny])
                continue;
            if (n == '0')
                continue;
            dfs(nx, ny, ans + 1);
            visited[nx][ny] = false;
        }
    }
}
