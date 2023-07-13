package bruteforce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15649_N과_M1 {
	static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r) {
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
				permutation(arr, out, visited, depth + 1, r);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		Arrays.setAll(arr, num -> num + 1);

		permutation(arr, new int[m], new boolean[arr.length], 0, m);

	}
}
