// Problem Link: https://www.acmicpc.net/problem/2178
// Theory : BFS
// BOJ 2178 미로 탐색

#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second
string board[100];
int dis[100][100];
int n = 0, m = 0;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        // getline(cin, board[i]);
        cin >> board[i];
        fill(dis[i], dis[i] + m, -1);
    }

    queue<pair<int, int>> Q;
    dis[0][0] = 0; // 출력할 때 +1 해줘야함.
    Q.push({0, 0});
    while (!Q.empty())
    {
        pair<int, int> np = Q.front();
        Q.pop();
        // cout << '(' << np.X << ", " << np.Y << ") -> ";

        for (int dir = 0; dir < 4; dir++)
        {
            int nx = np.X + dx[dir];
            int ny = np.Y + dy[dir];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                continue;
            if (board[nx][ny] == '0' || dis[nx][ny] != -1)
                continue;
            dis[nx][ny] = dis[np.X][np.Y] + 1;
            Q.push({nx, ny});
        }
    }

    cout << dis[n - 1][m - 1] + 1;
}