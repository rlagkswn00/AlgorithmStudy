package Array.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA12712_파리퇴치3 {
	public static void main(String[] args) throws IOException {
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
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			int tmp = 0;
			int tmp2 = 0;
			int[] dx = {0,0,-1,1};
			int[] dy = {1,-1,0,0};
			int[] dx1 = {1,1,-1,-1};
			int[] dy1 = {1,-1,1,-1};
			
			for(int i = 1 ; i < n+1 ; i++) {
				for(int j = 1 ; j < n+1 ; j++) {
					tmp += arr[i][j];
					tmp2 += arr[i][j];
					for(int l = 1 ; l < m ; l++) {
						for(int k = 0 ; k < 4 ; k++) {
							int nx = dx[k]*l + i;
							int ny = dy[k]*l + j;
							if(nx <= 0 || ny <= 0 || nx > n || ny > n)
								continue;
							
							tmp += arr[nx][ny];
							
							nx = dx1[k]*l + i;
							ny = dy1[k]*l + j;
							if(nx <= 0 || ny <= 0 || nx > n || ny > n)
								continue;
							
							tmp2 += arr[nx][ny];
						}
					}
					if(tmp > max)
						max = tmp;
					if(tmp2 > max)
						max = tmp2;
					tmp = 0;
					tmp2 = 0;
				}	
			}
			
			
			System.out.println("#" + test_case + " " + max);

		}
	}
}
