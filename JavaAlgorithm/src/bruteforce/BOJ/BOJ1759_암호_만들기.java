package bruteforce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1759_암호_만들기 {
	static char[] arr;
	static char[] out;
	static boolean[] visited;
	static char[] n1 = { 'a', 'e', 'i', 'o', 'u' };

	static void dfs(int depth, int r, int nextIdx) {
		if (depth == r) {
			int cnt1 = 0; // 모음 개수
			int k = 0;
			for (int j = 0; j < out.length; j++)
				for (;k < arr.length; k++)
					if (visited[k]) {
						out[j] = arr[k++];
						break;
					}

			String outStr = new String(out);
			char[] sortedOutStr = Arrays.copyOf(out, out.length);

			Arrays.sort(sortedOutStr);
			if (!outStr.equals(new String(sortedOutStr))) {
				return;
			}
			for (int i = 0; i < n1.length; i++)
				cnt1 += outStr.length() - outStr.replace(String.valueOf(n1[i]), "").length();

			if (cnt1 >= 1 && (out.length - cnt1) >= 2) {
				System.out.println(out);
				return;
			}
		}
		for (int i = nextIdx; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, r, i+1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		arr = br.readLine().replace(" ", "").toCharArray();
		Arrays.sort(arr);
		visited = new boolean[C];
		out = new char[L];

		dfs(0, L, 0);

	}
}
