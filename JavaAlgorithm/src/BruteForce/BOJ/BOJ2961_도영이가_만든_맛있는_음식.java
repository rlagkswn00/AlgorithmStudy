package BruteForce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2961_도영이가_만든_맛있는_음식 {
	static int N;
	static int[][] arr;
	static int out[];
	static int gap = (int)(1e9);

	static void dfs(int n, int s, int b) {
		if (n == N) {
			if (b > 0 &&Math.abs(s - b) < gap)
				gap = Math.abs(s - b);
			return;
			
		}
		dfs(n + 1, s * arr[n][0], b+ arr[n][1]);
		dfs(n + 1, s, b);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		out = new int[2];
		dfs(0, 1, 0);
		System.out.println(gap);
	}
}
