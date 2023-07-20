package Sorting.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11399_ATM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += (n - i) * arr[i];
			System.out.println(total);
			
		}
		System.out.println(total);
	}
}
