package Greedy.BOJ;

import java.util.Scanner;

public class BOJ2839_설탕_배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(n >= 0){
            if(n % 5 == 0){
                cnt += n/5;
                System.out.println(cnt);
                System.exit(0);
            }
            cnt++;
            n-=3;
        }
        System.out.println(-1);
    }
}
