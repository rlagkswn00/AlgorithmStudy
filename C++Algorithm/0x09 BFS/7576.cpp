#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

int n, m;
int dx[4] = {0, 1, 0, -1};
int dy[4] = {1, 0, -1, 0};

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> m >> n;

    int board[n][m];
    int done[n][m];
    queue<pair<int, int>> Q;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> board[i][j];

            if (board[i][j] == 1)
            {
                Q.push({i, j});
                done[i][j] = 0;
            }
            else if (board[i][j] == 0)
            {
                done[i][j] = -1;
            }
            else
            {
                done[i][j] = 0;
            }
        }
    }

    while (!Q.empty())
    {
        pair<int, int> np = Q.front();
        Q.pop();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int nx = np.X + dx[i];
                int ny = np.Y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if (board[nx][ny] == -1 || done[nx][ny] != -1)
                    continue;
                done[nx][ny] = done[np.X][np.Y] + 1;
                Q.push({nx, ny});
            }
        }
    }
    int result = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (done[i][j] == -1)
            {
                cout << -1;
                return 0;
            }
            result = max(result, done[i][j]);
        }
    }
    cout << result;
}