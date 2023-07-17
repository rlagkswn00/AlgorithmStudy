package queue.BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			q.add(i+1);
		
		while(q.size() != 1) {
			q.remove();
			int tmp = q.remove();
			q.add(tmp);
		}
		System.out.println(q.peek());
	}
}
