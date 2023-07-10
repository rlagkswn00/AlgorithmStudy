#include <bits/stdc++.h>
int dy[] = {0, 0, 1, -1};
int dx[] = {1, -1, 0, 0};
int MAX = 13;

enum
{
    EMPTY,
    CELL,
    POWER
};

using namespace std;

struct COORD
{
    int y, x;
};

int coreSize;
int T, N;
int map[MAX][MAX];
int ans1 = MAX * MAX;
int ans2 = 0;
vector<pair<int, int>> core;

void dfs(int C, int core_cnt, int power_cnt)
{

    if (C == coreSize)
    {
        if (core_cnt > ans2)
        {
            ans2 = core_cnt;
            ans1 = power_cnt;
        }
        else if (core_cnt == ans2)
        {
            if (ans1 > power_cnt)
                ans1 = power_cnt;
        }
        return;
    }

    for (int i = 0; i < 4; i++)
    {
        vector<COORD> coord;
        bool flag = false;

        int ny = core[C].first;
        int nx = core[C].second;

        while (1)
        {
            if (ny == 0 || nx == 0 || ny == N - 1 || nx == N - 1)
            {
                flag = true;
                break;
            }

            ny += dy[i];
            nx += dx[i];

            if (map[ny][nx] == EMPTY)
                coord.push_back({ny, nx});
            else
                break;
        }
        if (flag)
        {
            for (int j = 0; j < coord.size(); j++)
                map[coord[j].y][coord[j].x] = POWER;

            dfs(C + 1, core_cnt + 1, power_cnt + coord.size());

            for (int j = 0; j < coord.size(); j++)
                map[coord[j].y][coord[j].x] = EMPTY;
        }
    }

    dfs(C + 1, core_cnt, power_cnt);
}

void solution()
{
    cin >> T;
    for (int i = 1; i <= T; i++)
    {
        cin >> N;

        memset(map, 0, sizeof(map));
        ans1 = MAX * MAX;
        ans2 = 0;
        core.clear();

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                cin >> map[i][j];
                if (map[i][j] == CELL)
                {
                    if (i == 0 || j == 0 || i == N - 1 || j == N - 1)
                        continue;
                    core.push_back(make_pair(i, j));
                }
            }
        }
        coreSize = core.size();

        dfs(0, 0, 0);

        cout << "#" << i << " " << ans1 << endl;
    }
}

int main(int argc, char **argv)
{

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    solution();

    return 0;
}