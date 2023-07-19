package backtracking.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889_스타트와_링크 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] arr;
    static int gap;
    static int[] team1;
    static int[] team2;

    public static void main(String[] args) throws IOException {
        solv();
        System.out.println(gap);
    }

    private static void solv() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        team1 = new int[N];
        team2 = new int[N];

        gap = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);
    }

    private static void dfs(int depth, int cnt1, int cnt2) {
        if (depth == N) {
            if (cnt1 == cnt2) {
                int t1 = 0;
                int t2 = 0;
                for (int i = 0; i < cnt1 - 1; i++) {
                    for (int j = i+1; j < cnt1; j++) {
                        t1 += arr[team1[i]][team1[j]] + arr[team1[j]][team1[i]];
                        t2 += arr[team2[i]][team2[j]] + arr[team2[j]][team2[i]];
                    }
                }
                gap = Math.min(gap, Math.abs(t1 - t2));
            }
            return;
        }

        team1[cnt1] = depth;
        dfs(depth + 1, cnt1 + 1, cnt2);
        team2[cnt2] = depth;
        dfs(depth + 1, cnt1, cnt2 + 1);
    }
}