package bruteforce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1182_부분수열의_합 {
	static int N;
	static int M;
	static int S;
	static int[] arr;
//	static int sum;
	static int cnt, ans;

	static void dfs(int n, int cnt, int sum) {
		if (n == N) {
			if (cnt > 0 && sum == S)
				ans++;
			return;
		}
		dfs(n + 1, cnt + 1, sum + arr[n]);
		dfs(n + 1, cnt, sum);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		dfs(0, 0, 0);

		System.out.println(ans);
	}
}
