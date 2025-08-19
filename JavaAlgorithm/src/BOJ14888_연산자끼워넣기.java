import java.io.*;
import java.util.*;

public class BOJ2501_약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;

        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                count += 1;
                if (count == k) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
