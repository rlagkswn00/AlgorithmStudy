package UnionFind;

public class UnionFindTest {
    static int[] p;

    public static void main(String[] args) {
        p = new int[7];
        for (int i = 0; i < 7; i++) p[i] = i;

        //[1] union(0,1) : p[1의 대표자] = 0의 대표자
        union(0, 1);
        union(1, 2);

        //[2] 1과 2이 같은 집합인지 판단
        if(findSet(1) == findSet(2)) System.out.println("같은 집합");
        else System.out.println("다른 집합");
    }

    private static void union(int a, int b) {
        p[findSet(b)] = findSet(a);
    }

    private static int findSet(int n) {
        if (n == p[n]) return n;
        return p[n] = findSet(p[n]);
    }
}
