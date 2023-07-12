package sorting.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750_수_정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ;i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		for(int i = 0 ; i < n ;i++)
			sb.append(arr[i] + "\n");
		System.out.println(sb);
	}
}
