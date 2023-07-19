package backtracking.BOJ;

import java.io.IOException;
import java.util.Scanner;

public class BOJ9663_NQueen {
    static int N;
    static int cnt;
    static boolean v1[];
    static boolean v2[];
    static boolean v3[];


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        v1 = new boolean[N*2];
        v2 = new boolean[N*2];
        v3 = new boolean[N*2];

        dfs(0);
        System.out.println(cnt);
    }

    private static void dfs(int n) {
        if (n == N) {
            cnt++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!v1[i] && !v2[n+i] && !v3[n-i+N]){
                v1[i] = v2[n+i] = v3[n-i+N] = true;
                dfs(n + 1);
                v1[i] = v2[n+i] = v3[n-i+N] = false;
            }
        }
    }
}
