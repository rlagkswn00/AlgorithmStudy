package Sorting.JUNGOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNG1158_삽입정렬 {
	static void insert(int[] arr, int arrVal, int resultIdx) {

	}

	static void printResult(StringBuilder sb, int arr[]) {
		for (int j = 0; j < arr.length; j++)
			sb.append(arr[j] + " ");
		System.out.println(sb.toString().trim());
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				//arr[i]는 정렬할 것
				//arr[j]는 정렬된 내용
				//앞에서부터 보다가 더 큰게 발견되면
				//그 앞에 저장하면됨.
				if(arr[j] > arr[i]) {
					//옮기기
					int tmp = arr[i];
					for(int k = i ; k > j ; k--) {
						arr[k] = arr[k-1];
					}
					arr[j] = tmp;
				}
			}
			printResult(sb,arr);
			sb = new StringBuilder();
		}

	}
}
