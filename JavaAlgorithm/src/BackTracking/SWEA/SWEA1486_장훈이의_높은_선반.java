package BackTracking.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1486_장훈이의_높은_선반 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, B;
    static int[] height;
    static int min;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= T; i++) {
            min = Integer.MAX_VALUE;
            solv();
            System.out.printf("#%d %d\n", i, min - B);
        }

    }

    private static void solv() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        height = new int[N];
        for (int i = 0; i < N; i++)
            height[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0);
    }

    private static void dfs(int n, int nowHeight) {
        if (min < nowHeight)
            return;
        if (n == N) {
                if (nowHeight >= B && min > nowHeight)
                    min = nowHeight;
            return;
        }
        dfs(n + 1, nowHeight + height[n]);
        dfs(n + 1, nowHeight);
    }
}
