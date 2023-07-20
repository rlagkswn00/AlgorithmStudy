package unionFind.BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1976_여행_가자 {
    static int N,M;
    static int[] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        p = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            p[i] = i;
        }

        for(int i = 1 ; i < N+1 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j < N+1 ; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 1)
                    union(i,j); // 도시 연결
            }
        }

        st = new StringTokenizer(br.readLine());
        int tmp = Integer.parseInt(st.nextToken());
        for(int i = 1 ; i < M ; i++){
            if(findSet(tmp) != findSet(Integer.parseInt(st.nextToken()))){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }

    private static void union(int a, int b) {
        p[findSet(b)] = findSet(a);
    }

    private static int findSet(int n) {
        if(n == p[n]) return n;
        return p[n] = findSet(p[n]);
    }

}
