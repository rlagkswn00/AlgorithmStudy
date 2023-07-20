package Array.BOJ;

import java.util.*;

class Main {
	static int N;
	static int objNum;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N ; i++)
			arr[i] = sc.nextInt();
		
		objNum = sc.nextInt();
		
		for (int i : arr) {
			if(i == objNum)
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
