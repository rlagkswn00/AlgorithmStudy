package sorting.JUNGOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JUNG1157_버블정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i ++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < n-1 ; i++) {
			for(int j = 0 ; j < n-i-1; j++) {
//				System.out.println(Arrays.toString(arr));
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			for(int j = 0 ; j < n ; j++)
				sb.append(arr[j] + " ");
			System.out.println(sb.toString().strip());
			sb = new StringBuilder();
		}
		
	}
}
