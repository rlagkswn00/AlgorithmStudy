package tree;

import java.util.Scanner;


public class tree {
    static int N;
    static int[] tree;

    static void preOrder(int n){
        if(n > N || n < 1)
            return;
        System.out.print((char)tree[n]+" ");	// 중앙: 노드에 저장된 값을 출력
        preOrder(n * 2);
        preOrder(n * 2+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배역의 크기 입력");
        N = sc.nextInt();
        tree = new int[N +1];

        // [0] tree에 데이터 저장
        for (int i=1; i<=N; i++) {
            tree[i] = (char)('A'+i-1);
        }

        preOrder(1);
    }
}
