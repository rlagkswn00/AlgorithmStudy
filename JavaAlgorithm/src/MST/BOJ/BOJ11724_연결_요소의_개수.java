package MST.BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11724_연결_요소의_개수 {
    static int N, M;
    static int[] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        p = new int[N+1];

        for (int i = 1; i < N + 1; i++) p[i] = i;

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            union(s,e);
//            union(Math.min(s,e), Math.max(s,e));
        }

        for (int i = 1; i < N + 1; i++) {
            findSet(i);
        }
        ArrayList<Integer> pList = new ArrayList<>();
        int cnt = 0;
        for(int i = 1 ; i < N + 1 ; i++){
            if (!pList.contains(p[i])) {
                cnt ++;
                pList.add(p[i]);
            }
        }
        System.out.println(cnt);
    }

    private static void union(int a, int b) {
        p[findSet(b)] = findSet(a);
    }

    private static int findSet(int n) {
        if(n == p[n]) return n;
        return p[n] = findSet(p[n]);
    }


}
