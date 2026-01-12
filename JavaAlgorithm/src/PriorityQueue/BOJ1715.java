package PriorityQueue;

import java.io.*;
import java.util.*;

public class BOJ1715 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            long num =  Integer.parseInt(br.readLine());
            pq.add(num);
        }

        int total = 0;

        while (pq.size() >= 2) {
            long num1 = pq.poll();
            long num2 = pq.poll();

            total += num1 + num2;
            pq.add(num1 + num2);
        }
        System.out.println(total);
    }
}
