package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(100);
		q.add(200);
		q.add(300);
		q.add(400);
		q.add(500);
		System.out.println(q.peek());
		
	}
}
