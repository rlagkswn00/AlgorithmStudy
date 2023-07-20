package Sorting.JUNGOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNG1146_선택정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n-1; i++) {
			int minIdx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[minIdx])
					minIdx = j;

			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
//			System.out.println(minIdx + " " + i + " ");
			for(int j = 0 ; j < n ; j++)
				sb.append(arr[j] + " ");
			System.out.println(sb.toString().trim());
			sb = new StringBuilder();


		}
	}
}
