package array.BOJ;

import java.util.*;
import java.io.*;

public class Main {
	static int N, M, i, j;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		int[] arr = new int[N+1];
		int[] arr2 = new int[N+1];

		for (int k = 1; k <= N; k++) {
			arr[k] = sc.nextInt();
			arr2[k] = arr2[k-1] + arr[k];
		}
//		System.out.println(Arrays.toString(arr2));
		while (M-- > 0) {
			int sum = 0;
			i = sc.nextInt() - 1;
			j = sc.nextInt();
			System.out.println(arr2[j] - arr2[i]);
		}
	}
}
