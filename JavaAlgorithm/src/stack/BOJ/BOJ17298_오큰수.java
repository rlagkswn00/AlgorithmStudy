package stack.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17298_오큰수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> inputStack = new Stack<>();
		Stack<Integer> resultStack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++)
			inputStack.push(Integer.parseInt(st.nextToken()));
		
		
		for (int i = 1; i < n + 1; i++) {
			int inputVal = inputStack.pop();

			while (!stack.isEmpty() && stack.peek() <= inputVal)
				stack.pop();
			
			if (stack.isEmpty()) 
				resultStack.push(-1);
			else
				resultStack.push(stack.peek());
			stack.push(inputVal);
		}
		while (!resultStack.isEmpty())
			sb.append(resultStack.pop() + " ");
		System.out.println(sb);
	}
}
