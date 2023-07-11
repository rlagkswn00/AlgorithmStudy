package array.SWEA;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SWEA2001_파리_퇴치 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] arr = new int[n+1][n+1];

			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; j++) {
					arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 1 ; i < n+1 ; i++) {
				for(int j = 1 ; j < n+1 ; j++) {
					arr[j][i] += arr[j-1][i];
				}
			}
			
			int sum = 0;
			int tmp = 0;
			
			for(int i = m ; i < n+1 ; i++) {
				for(int j = m ; j < n+1 ; j++) {
					tmp = arr[i][j] - arr[i-m][j] - arr[i][j-m] + arr[i-m][j-m];
					if(sum < tmp)
						sum = tmp;
				}
			}
			
			System.out.println("#" + test_case + " " + sum);

		}
	}
}