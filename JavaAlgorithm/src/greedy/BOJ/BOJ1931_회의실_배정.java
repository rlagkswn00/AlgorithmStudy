package greedy.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1931_회의실_배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (x, y) -> x[1] == y[1] ? (x[0]-y[0]):(x[1]-y[1]));

        int ans = 0, last = 0;
        for(int i = 0 ; i < n ;i++){
            if(last <= arr[i][0]){
                ans++;
                last = arr[i][1];
            }
        }

        System.out.println(ans);

    }
}
