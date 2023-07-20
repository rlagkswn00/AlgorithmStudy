package BackTracking.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA13992_전자카트 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, min;
    static int[][] arr;
    static boolean[] isArrived;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= T; i++) {
            min = (int) 1e9;
            solv();
            System.out.printf("#%d %d\n", i, min);
        }

    }

    private static void solv() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        isArrived = new boolean[N];
        for (int i = 0; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(1, 0, 0);
    }

    private static void dfs(int n, int battery, int start) {
        if (n == N) {
            battery += arr[start][0];
            if (min > battery)
                min = battery;
            return;
        }

        for(int i = 1 ; i < N ; i++){
            if (!isArrived[i]) {
                isArrived[i] = true;
                dfs(n+1, battery + arr[start][i], i);
                isArrived[i] = false;
            }
        }

    }
}
