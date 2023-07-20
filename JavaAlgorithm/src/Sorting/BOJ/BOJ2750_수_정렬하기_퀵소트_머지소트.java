package Sorting.BOJ;

import java.util.Scanner;

public class BOJ2750_수_정렬하기_퀵소트_머지소트 {

	static int[] arr;
	static int[] tarr;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		quickSort(0, n - 1);

		for (int i = 0; i < n; i++)
			sb.append(arr[i] + "\n");
		System.out.println(sb);
	}
	

	public static void msort(int left, int right) {
		//	[0] 종료조건 체크 => 종료
		if (left==right)	return;
		
		//	[1] 절반을 나눠서, 양쪽을 정렬(msort)
		int m = (left+right)/2;
		msort(left, m);		//	왼쪽정렬
		msort(m+1, right);	//	오른쪽정렬
		
		// 	[2] 합치기
		// 임시 tarr에 원본데이터 복사(지금 병합할 부분만!)
		for (int i=left; i<=right; i++) tarr[i]=arr[i];
		int l=left, r=m+1, i=left;
		// 	[3] 둘 중 하나 소진될때까지 작은값부터 붙임  
		while (l<=m && r<=right) {	//	둘 중 작은값 붙이기
			if (tarr[l]<tarr[r])	arr[i++] = tarr[l++];
			else					arr[i++] = tarr[r++];
		}
		//	[4] 남은 배열의 값 뒤에 붙이기(둘 중 하나만 남아있음)
		while (l<=m) 		arr[i++] = tarr[l++];
		while (r<=right)	arr[i++] = tarr[r++];
		
	}
	

	static void quickSort(int l, int r) {
		if (l >= r)
			return;

		int p = partition(l, r);
		quickSort(l, p - 1);
		quickSort(p + 1, r);
	}

	static int partition(int l, int r) {
		int p = l++;
		while (l < r) {
			while (l < r && arr[l] < arr[p])
				l++;
			while (l < r && arr[r] > arr[p])
				r--;
			if (l < r) {
				int tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
			}
		}
		if (arr[p] <= arr[l])
			l--;
		int tmp = arr[l];
		arr[l] = arr[p];
		arr[p] = tmp;

		return l;
	}
}