package BruteForce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15649_N과_M1 {
	static int[] arr;
	static int[] out;
	static boolean[] visited;
	static int n;
	static int r;

	static void dfs(int depth) {
		// 순열 저장 완료, 출력
		if (depth == r) {
			for (int i : out)
				System.out.print(i + " ");
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				out[depth] = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		arr = new int[n];
		out = new int[r];
		visited = new boolean[n];
		Arrays.setAll(arr, num -> num + 1);

		dfs(0);

	}
}
