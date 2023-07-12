package stack.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2493_탑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i < n + 1; i++) {
			int inputVal = Integer.parseInt(st.nextToken());
			if (!stack.isEmpty())
				while (stack.peek()[1] < inputVal) {
					stack.pop();
					if (stack.isEmpty())
						break;
				}
			
			if (stack.isEmpty()) {
				sb.append(0 + " ");
				stack.push(new int[] { i, inputVal });
			} else
				sb.append(stack.peek()[0] + " ");
			stack.push(new int[] { i, inputVal });
		}
		System.out.println(sb);
	}
}