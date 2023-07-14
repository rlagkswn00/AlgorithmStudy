import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5215_햄버거_다이어트 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[][] arr;
	static int N;
	static int L;
	static int maxScore = 0;

	static void dfs(int n, int cal, int score) {
		if (n == N) {
			if (cal <= L && maxScore < score) {
				maxScore = score;
			}
			return;
		}
		dfs(n+1,cal+arr[n][1] , score + arr[n][0]);
		dfs(n+1,cal, score);		
	}

	static void solv() throws IOException {

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());

		arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0, 0);

	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int i = 1; i < T + 1; i++) {
			maxScore = 0;
			solv();
			System.out.printf("#%d %d\n", i, maxScore);
		}

	}
}
