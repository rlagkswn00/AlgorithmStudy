package stack.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<int[]> st1 = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < n + 1; i++) {
			int top = Integer.parseInt(st.nextToken());
			while(!st1.isEmpty()) {
				if(st1.peek()[1] >= top) {
					sb.append(st1.peek()[0] + " ");
					break;
				}
				st1.pop();
			}
			if(st1.isEmpty())
				sb.append(0 + " ");
			st1.push(new int[] {i,top});
		}
		System.out.print(sb);

	}
}