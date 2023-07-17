package stack.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874_스택_수열{
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int cnt = 1;
		int tmp = 0;

		for (int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			
			while (cnt <= tmp) {
				st.push(cnt++);
				sb.append("+\n");
			}
			if (st.peek() == tmp) {
				st.pop();
				sb.append("-\n");
			}
			else{
				System.out.println("NO");
				System.exit(0);
			}
//			System.out.println(st.toString());
		}
		System.out.println(sb);
	}
}
