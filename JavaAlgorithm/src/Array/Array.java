package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] arr1 = {100,200,300,400,500};
		System.out.println(arr1[2]);
		arr1[3]=999;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		//1차원 배열 출력
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//2차원 배열 출력
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		arr2[1][1] = 999;
		System.out.println(Arrays.deepToString(arr2));
	}
}
