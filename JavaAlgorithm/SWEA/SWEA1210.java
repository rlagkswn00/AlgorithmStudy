package day01.array;

import java.util.Scanner;


class SWEA1210 {
	static Scanner sc = new Scanner(System.in);
	static int[][] arr = new int[100][102];

	public static int solv() {
		String t = sc.nextLine();
		int x = 99;
		int y = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 1; j < 101; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 2) {
					y = j;
				}
			}
		}
		while (x != 0) {
			arr[x][y] = 0;
			if(arr[x][y-1] == 1) y--;
			else if(arr[x][y+1] == 1) y++;
			else x--;
		}
		return y;
	}

	public static void main(String args[]) throws Exception {
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.println("#" + test_case + " " + (solv()-1));

		}
	}
}