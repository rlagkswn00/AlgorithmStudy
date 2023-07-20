package Queue.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158_요세푸스_문제 {
	public static void main(String[] args) throws IOException{
		Queue<Integer> q = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 1 ; i < n+1 ;i++)
			q.add(i);
		
		int cnt = 1;
		sb.append("<");
		while(!q.isEmpty()) {
//			System.out.println(q);
			if(cnt % k != 0) {
				cnt++;
				q.add(q.remove());
			}else {
				cnt = 1;
				sb.append(q.remove());
				if(!q.isEmpty())
					sb.append(", ");
				else
					continue;
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
