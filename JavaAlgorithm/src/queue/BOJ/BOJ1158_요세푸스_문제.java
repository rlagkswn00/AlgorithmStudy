package queue.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> resultQ = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 1 ; i < n+1 ;i++)
			q.add(i);
		
		int cnt = 0;
		while(!q.isEmpty()) {
			if(cnt == k-1) {
				//pop
				resultQ.add(q.remove());
			}else {
				//re push
				int tmp = q.remove();
				q.add(tmp);
			}
			
			cnt = (cnt+1) % k;
		}
		System.out.print("<");
		while(!resultQ.isEmpty()) {
			System.out.print(resultQ.poll());
			if(!resultQ.isEmpty()) {
				 System.out.print(", ");
			}
		}
		System.out.print(">");
	}
}
