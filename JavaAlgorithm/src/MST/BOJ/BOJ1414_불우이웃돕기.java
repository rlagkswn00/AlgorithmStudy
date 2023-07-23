package MST.BOJ;

import java.io.*;
import java.util.*;

public class BOJ1414_불우이웃돕기 {
    static int findSet(int x) {
        if (p[x] == x) return x;
        return p[x] = findSet(p[x]);
    }
    static void union(int a, int b) {
        p[findSet(b)] = findSet(a);
    }
    static boolean isSameParent(int a, int b) {
        return findSet(a) == findSet(b);
    }
    static class edge {
        int x;
        int y;
        int c;

        edge(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.c = cost;
        }
    }

    static int[] p;
    static int N;
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        //union-find 위한 배열 초기화
        p = new int[N + 1];
        for (int i = 0; i <= N; i++) p[i] = i;

        //엣지 리스트 추가
        ArrayList<edge> edgeList = new ArrayList<>();

        //입력 값 a~z 와 A~Z 구분, 숫자로 변환하여 리스트에 저장
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < N; j++) {
                int cost = -1;
                if (tmp.charAt(j) == '0')
                    continue;
                if (tmp.charAt(j) >= 'A' && tmp.charAt(j) <= 'Z')
                    cost = tmp.charAt(j) - 'A' + 27;
                if (tmp.charAt(j) >= 'a' && tmp.charAt(j) <= 'z')
                    cost = tmp.charAt(j) - 'a' + 1;
                ans += cost;
                edgeList.add(new edge(i + 1, j + 1, cost));
            }
        }


        //비용순으로 정렬
        Collections.sort(edgeList, (x, y) -> x.c - y.c);

        //크루스칼 알고리즘을 통해 연결
        for (edge edge : edgeList)
            if (!isSameParent(edge.x, edge.y)) {
                union(edge.x, edge.y);
                ans -= edge.c;
            }


        //모두 연결된지 여부를 나누는 플래그
        boolean flag = true;

        //모두 같은 집합인지 확인(연결되어있는지)
        int tmp = findSet(1);
        for (int i = 2; i < N + 1; i++)
            if (tmp != findSet(i)) {
                flag = false;
                break;
            }

        if (flag)
            System.out.println(ans);
        else
            System.out.println(-1);

    }

}