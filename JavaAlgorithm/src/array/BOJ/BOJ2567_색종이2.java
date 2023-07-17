package array.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2567_색종이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[102][102];
		while (n-- != 0) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++)
					arr[i + x][j + y] = 1;
			}
		}

		int sum = 0;

		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
//		System.out.println(Arrays.deepToString(arr));
		for (int i = 1; i < 100 + 1; i++) {
			for (int j = 1; j < 100 + 1; j++) {
				if (arr[i][j] == 1)
					for (int k = 0; k < 4; k++) {
							if (arr[i + dx[k]][j + dy[k]] == 0)
								sum++;
						
					}
			}
		}
		System.out.println(sum);

	}
}
