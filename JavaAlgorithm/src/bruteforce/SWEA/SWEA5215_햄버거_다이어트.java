package bruteforce.SWEA;
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
		//종료 조건
		if (n == N) {
			//칼로리 합이 기준치보다 작고,
			//맛 점수가 기존 최대 점수보다 클 경우 최신화
			if (cal <= L && maxScore < score) {
				maxScore = score;
			}
			return;
		}
		
		//탐색 실행
		dfs(n+1,cal+arr[n][1] , score + arr[n][0]);
		dfs(n+1,cal, score);		
	}

	static void solv() throws IOException {

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());

		//입력에 따른 배열 생성
		//최대 점수 0점 초기화
		arr = new int[N][2];
		maxScore = 0;
		
		//칼로리, 맛 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		//탐색 시작
		dfs(0, 0, 0);

	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		//Test case 개수 입력 받아 진행
		for (int i = 1; i < T + 1; i++) {
			//매 테스트 케이스 실행 후 출력
			solv();
			System.out.printf("#%d %d\n", i, maxScore);
		}

	}
}
