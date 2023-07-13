package bruteforce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15650_N과_M2 {
	static void combination(int[] arr, boolean[] visited, int depth, int r, int nextIdx) {
		if (depth == r) {
			for (int i = 0; i < arr.length; i++) {
				if (visited[i])
					System.out.print(arr[i] + " ");			
			}
			System.out.println();
			return;
		}
		for (int i = nextIdx; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				combination(arr, visited, depth + 1, r, i + 1);
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
		combination(arr, new boolean[arr.length], 0, m, 0);
	}
}