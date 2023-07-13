package bruteforce.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9742_순열 {
	static int cnt = 0;
	static int objNum;
	static String result = "";
	static char[] strArr;

	static void permutation(char[] out, boolean[] visited, int depth, int r) {
		if (depth == r) {
			cnt++;
			if (objNum == cnt)
				result = new String(out);
			return;
		}

		for (int i = 0; i < r; i++) {
			if (!visited[i]) {
				visited[i] = true;
				out[depth] = strArr[i];
				permutation(out, visited, depth + 1, r);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String line;
		while((line=br.readLine())!=null) {
			st = new StringTokenizer(line);
			if (!st.hasMoreTokens())
				break;

			strArr = st.nextToken().toCharArray();
			objNum = Integer.parseInt(st.nextToken());
			cnt = 0;
			result = "";

			permutation(new char[strArr.length], new boolean[strArr.length], 0, strArr.length);

			if (cnt < objNum)
				result = "No permutation";
			System.out.println(new String(strArr) + " " + objNum + " = " + result);
		}
	}
}
