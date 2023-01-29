// [S/W 문제해결 기본] 9일차 - 공통조상
#include <bits/stdc++.h>
using namespace std;

typedef struct Node
{
    int data;
    Node *left;
    Node *right;
} Node;

Node *Head;
int v, e, n, m;
int v1, v2, a, b;
void solve()
{

    cin >> v1, v2;
}
int main(void)
{
    int test_case;
    int T;

    freopen("input.txt", "r", stdin);
    cin >> T;

    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}