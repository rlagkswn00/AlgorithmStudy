package Array.BOJ;

import java.util.*;
import java.io.*;

public class BOJ2018_투_포인터 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int total(int front, int back) {
		int answer = 0;
		for (int i = front; i < back + 1; i++)
			answer += i;
		return answer;
	}

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		st = new StringTokenizer(input);
		int n = Integer.parseInt(st.nextToken());

		int start = 1;
		int end = 1;
		int cnt = 0;
		int sum = 0;
		while (end <= n) {
			sum = total(start, end);
			if (sum== n) {
				cnt++;
				start++;
				end++;
			} else if (sum < n) {
				end++;
			} else {
				start++;
			}

		}
		System.out.println(cnt);
	}
}
