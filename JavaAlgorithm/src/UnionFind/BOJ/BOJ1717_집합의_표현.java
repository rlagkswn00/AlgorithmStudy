package UnionFind.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1717_집합의_표현 {
    static int N;
    static int M;
    static int[] p;

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        p = new int[N + 1];

        for(int i = 1 ; i <= N ;i++)
            p[i] = i;

        for(int i = 0 ; i < M ;i++){
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if(op == 0){
                //union
                union(first, second);
            }else{
                //check
                if(findSet(first) == findSet(second)) sb.append("YES").append("\n");
                else sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void union(int x, int y) {
        p[findSet(y)] = findSet(x);
    }

    private static int findSet(int n) {
        if(n == p[n]) return n;
        return p[n] = findSet(p[n]);
    }
}
