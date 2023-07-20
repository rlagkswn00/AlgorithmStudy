package Stack;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(100);
		st.add(200);
		st.add(300);
		st.add(400);
		st.add(500);
		
		System.out.println(st.pop());
	}
}
