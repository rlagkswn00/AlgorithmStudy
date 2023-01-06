// Problem Link: https://www.acmicpc.net/problem/1926
// Theory : BFS
// BOJ 1926 그림
#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, b;
    cin >> a >> b;
    int board[a][b];
    bool vis[a][b];

    for (int i = 0; i < a; i++)
    {
        for (int k = 0; k < b; k++)
        {
            cin >> board[i][k];
            vis[i][k] = 0;
        }
    }
}