package sorting.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750_수_정렬하기_퀵소트 {

	static int[] arr;

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