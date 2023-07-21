package MST.BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1197_최소_스패닝_트리 {
    static int V, E;
    static int[][] link;
    static int[] p;

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());


        p = new int[V+1];
        for (int i=1; i<=V; i++) p[i]=i;

        link = new int[E][3];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            link[i][0] = Integer.parseInt(st.nextToken());
            link[i][1] = Integer.parseInt(st.nextToken());
            link[i][2] = Integer.parseInt(st.nextToken());
        }

        //가중치 오름차순 정렬
        Arrays.sort(link, (x, y) -> x[2] - y[2]);

        int ans = 0;
        int cnt = 0;
        //같은 집합이 아닌 노드를 연결하는 링크 v-1개 선택
        for (int i = 0; i < E; i++) {
            //같은 집합이 아닌 링크 선택
            if (findSet(link[i][0]) != findSet(link[i][1])) {
                union(link[i][0], link[i][1]);
                ans += link[i][2];
                if (++cnt == V - 1)
                    break;
            }
        }

        if(cnt == V-1) System.out.println(ans);
        else System.out.println(-1);

    }

    private static void union(int x, int y) {
        p[findSet(y)] = findSet(x);
    }

    private static int findSet(int n) {
        if (n == p[n]) return n;
        return p[n] = findSet(p[n]);
    }
}
