package BinarySearch.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920_수찾기 {
    static int[] nArr;
    static int[] mArr;
    static int N, M;
    static int s, e, m;

    static int binarySearch(int k) {
        while(s<=e){
            m = (s + e) / 2;
            if(nArr[m] == k) return 1;
            if(nArr[m] > k) e = m-1;
            if(nArr[m] < k) s = m+1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        nArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < nArr.length; i++)
            nArr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        mArr = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < mArr.length; i++)
            mArr[i] = Integer.parseInt(st.nextToken());

        //정렬
        Arrays.sort(nArr);

        //찾기
        for (int i = 0; i < mArr.length; i++) {
            int num = mArr[i];
            s = 0;
            e = nArr.length - 1;
            m = nArr.length / 2;
            mArr[i] = binarySearch(num);
        }

        for (int n :
                mArr)
            sb.append(n + "\n");

        System.out.println(sb);
    }
}
