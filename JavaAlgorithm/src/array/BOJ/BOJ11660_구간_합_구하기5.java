package array.BOJ;

import java.util.*;
import java.io.*;

public class BOJ11660_구간_합_구하기5 {
	static int N;
	static int M;
	static int x1, y1;
	static int x2, y2;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		StringTokenizer st = new StringTokenizer(nm);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[N+1][N+1];

		for (int i = 1; i < N+1; i++) {
			String n = br.readLine();
			st = new StringTokenizer(n);
			for (int j = 1; j < N+1; j++)
				dp[i][j] = dp[i][j - 1] + dp[i-1][j] - dp[i-1][j-1] +Integer.parseInt(st.nextToken());
		}
			

//		System.out.println(Arrays.deepToString(dp));
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			// y -->>
			// x 아래
			int sum = 0;
			sum += dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1];
			System.out.println(sum);

		}
	}
}
