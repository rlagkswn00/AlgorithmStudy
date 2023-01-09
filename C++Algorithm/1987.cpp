#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

int r, c;
string board[100];
int dx[4] = {0, 1, -1, 0};
int dy[4] = {1, 0, 0, -1};
bool products[26];

int cnt = 0;

void dfs(pair<int, int> np, int dis)
{

    bool flag = false;
    for (int i = 0; i < 4; i++)
    {
        int nx = np.X + dx[i];
        int ny = np.Y + dy[i];

        if (nx < 0 || nx >= r || ny < 0 || ny >= c)
            continue;

        if (products[board[nx][ny] - 'A'])
            continue;

        flag = true;
        products[board[nx][ny] - 'A'] = true;
        dfs({nx, ny}, dis + 1);
        products[board[nx][ny] - 'A'] = false;
    }
    if (!flag)
    {
        cnt = max(cnt, dis);
        return;
    }
}

int main(int argc, char **argv)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cnt = 0;
    cin >> r >> c;
    for (int i = 0; i < r; i++)
    {
        cin >> board[i];
    }
    products[board[0][0] - 'A'] = true;
    dfs({0, 0}, 1);
    cout << cnt;

    return 0;
}