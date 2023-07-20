package BinarySearch.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2630_색종이_민들기 {
    static int[][] arr;
    static int [] cnt = {0,0};

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N= Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        countColor(0,0,N);
        //끝
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
    }

    private static boolean isAllSame(int si, int sj, int N){
        int c = arr[si][sj];
        for(int i = si; i<si+N;i++){
            for(int j = sj; j < sj+N ; j++){
                if(c != arr[i][j]) return false;
            }
        }
        return true;
    }
    private static void countColor(int si,int sj,int N) {
        //종료조건
        if(N<1)
            return;

        //같은 색이면 w/bCnt++ 아니면 4등분
        if(isAllSame(si,sj,N)) { // 모두 흰색
            cnt[arr[si][sj]]++;
        }else{
            int m = N / 2;
            countColor(si,sj,m);
            countColor(si,sj+m,m);
            countColor(si+m,sj,m);
            countColor(si+m,sj+m,m);
        }
    }
}
