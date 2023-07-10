package day01.array;

import java.util.*;
import java.io.*;

public class BOJ2018 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int total(int front,int back) {
		int answer = 0;
		for(int i = front ; i < back + 1 ; i++)
			answer += i;
		return answer;
	}
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		st = new StringTokenizer(input);
		int n = Integer.parseInt(st.nextToken());

		int front = 1;
		int cnt = 0;
		for(int back = 2 ; back < n + 1 ; back++) {
			if(total(front,back) == n) {
				cnt++;
				System.out.println(front + " " + back);
			}else if(total(front,back) < n) {
				continue;
			}else {
				front++;
			}
		}
		
		System.out.println(cnt);
	}
}
