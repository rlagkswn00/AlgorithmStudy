package stack.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ17608_막대기 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++)
			st.push(sc.nextInt());

//		System.out.println(st.toString());
		int front = st.pop();
		int cnt = 1;
		while(!st.isEmpty()) {
			if(st.peek() > front) {
				cnt++;
				front = st.peek();
			}
			st.pop();
		}
		System.out.println(cnt);
	}
}
