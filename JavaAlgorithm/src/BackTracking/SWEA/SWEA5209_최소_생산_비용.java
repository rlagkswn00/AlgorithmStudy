package BackTracking.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5209_최소_생산_비용 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, min;
    static int[][] arr;
    static int[] out;// 구매한 상품 가격 담는 곳
    static boolean[] isBuy;

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
        isBuy = new boolean[N];
        out = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
    }

    private static void dfs(int n, int price) {
        if(min < price)
            return;

        if (n == N) {
            if (min > price)
                min = price;
            return;
        }

        for (int i = 0; i < N; i++) {
                if (!isBuy[i]) {
                    isBuy[i] = true;
                    dfs(n + 1, price + arr[n][i]);
                    isBuy[i] = false;
                }
        }
    }
}
