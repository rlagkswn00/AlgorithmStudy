// Problem Link: https://www.acmicpc.net/problem/1926
// Theory : BFS
// BOJ 1926 그림
#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

int n, m;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int cnt = 0, width = 0;
    cin >> n >> m;
    int board[n][m];
    bool vis[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < m; k++)
        {
            cin >> board[i][k];
            vis[i][k] = 0;
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < m; k++)
        {
            queue<pair<int, int>> Q;
            if (board[i][k] == 0 || vis[i][k])
            {
                continue;
            }
            cnt++;
            vis[i][k] = 1;
            Q.push(make_pair(i, k));
            // cout << "now start point " << i << ", "
            //      << k
            //      << "\n";
            int nwidth = 0;

            while (!Q.empty())
            {
                nwidth++;
                pair<int, int> cur = Q.front();
                Q.pop();
                // cout << '(' << cur.X << ", " << cur.Y << ") -> ";
                for (int dir = 0; dir < 4; dir++)
                { // 상하좌우 칸을 살펴볼 것이다.
                    int nx = cur.X + dx[dir];
                    int ny = cur.Y + dy[dir]; // nx, ny에 dir에서 정한 방향의 인접한 칸의 좌표가 들어감
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                        continue; // 범위 밖일 경우 넘어감
                    if (vis[nx][ny] || board[nx][ny] != 1)
                        continue;    // 이미 방문한 칸이거나 파란 칸이 아닐 경우
                    vis[nx][ny] = 1; // (nx, ny)를 방문했다고 명시
                    Q.push({nx, ny});
                }
                width = max(width, nwidth);
            }

            // cout << ";" << endl;
        }
    }

    cout << cnt << "\n";
    cout << width << "\n";
}