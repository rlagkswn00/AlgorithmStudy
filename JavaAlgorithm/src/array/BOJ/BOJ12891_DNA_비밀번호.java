package array.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891_DNA_비밀번호 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		char[] dnaStr = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		int[] cnts = new int[4];
		for (int i = 0; i < 4; i++) {
			cnts[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		int[] cnts2 = new int[4];
		for (int i = 0; i < p; i++) {
			if (dnaStr[i] == 'A')
				cnts2[0]++;
			if (dnaStr[i] == 'C')
				cnts2[1]++;
			if (dnaStr[i] == 'G')
				cnts2[2]++;
			if (dnaStr[i] == 'T')
				cnts2[3]++;
		}
		if (cnts[0] - cnts2[0] <= 0 && cnts[1] - cnts2[1] <= 0 && cnts[2] - cnts2[2] <= 0 && cnts[3] - cnts2[3] <= 0)
			cnt++;
		if (dnaStr[0] == 'A')
			cnts2[0]--;
		else if (dnaStr[0] == 'C')
			cnts2[1]--;
		else if (dnaStr[0] == 'G')
			cnts2[2]--;
		else if (dnaStr[0] == 'T')
			cnts2[3]--;

		for (int i = p; i < s ; i++) {
			if (dnaStr[i] == 'A')
				cnts2[0]++;
			if (dnaStr[i] == 'C')
				cnts2[1]++;
			if (dnaStr[i] == 'G')
				cnts2[2]++;
			if (dnaStr[i] == 'T')
				cnts2[3]++;
			
			if (cnts[0] - cnts2[0] <= 0 && cnts[1] - cnts2[1] <= 0 && cnts[2] - cnts2[2] <= 0
					&& cnts[3] - cnts2[3] <= 0)
				cnt++;
			int startPoint = i-p+1;
			if (dnaStr[startPoint] == 'A')
				cnts2[0]--;
			else if (dnaStr[startPoint] == 'C')
				cnts2[1]--;
			else if (dnaStr[startPoint] == 'G')
				cnts2[2]--;
			else if (dnaStr[startPoint] == 'T')
				cnts2[3]--;
		}
		System.out.println(cnt);
	}
}