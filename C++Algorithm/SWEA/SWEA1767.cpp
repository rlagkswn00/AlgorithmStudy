// 새로운 불면증 치료법
#include <bits/stdc++.h>
using namespace std;
#define MAX 12
#define INF 987654321

struct node
{
    int x, y;

    node() {}
    node(int _x, int _y) : x(_x), y(_y) {}
};

int testcase;
int n, ans1, ans2;
int map[MAX][MAX];

int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

vector<node> core;
void printMap()
{
    cout << "\n";
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << map[i][j] << " ";
        }
        cout << "\n";
    }
}
void dfs(int ind, int cnt, int ins, int sum)
{
    // 모든 코어 작업을 끝낸 경우
    if (cnt == core.size())
    {
        // 최대의 코어를 설치했을 때, 최소의 전선 개수
        if (ins > ans1)
        {
            ans1 = ins;
            ans2 = sum;
        }
        else if (ins == ans1)
        {
            ans1 = ins;
            ans2 = min(ans2, sum);
        }

        return;
    }

    // 설치하는 경우
    for (int i = 0; i < 4; i++)
    {
        vector<node> tmp;

        bool flag = false;
        int nr = core[ind].x;
        int nc = core[ind].y;

        while (1)
        {
            if (nr == 0 || nc == 0 || nr == n - 1 || nc == n - 1)
            {
                flag = true;
                break;
            }

            nr += dx[i];
            nc += dy[i];

            if (map[nr][nc] == 0)
            {
                tmp.push_back(node(nr, nc));
            }
            else
            {
                break;
            }
        }

        if (flag)
        {
            // 전선 설치
            for (int j = 0; j < tmp.size(); j++)
            {
                map[tmp[j].x][tmp[j].y] = 2;
            }

            dfs(ind + 1, cnt + 1, ins + 1, sum + (int)tmp.size());

            // 전선 해체
            for (int j = 0; j < tmp.size(); j++)
            {
                map[tmp[j].x][tmp[j].y] = 0;
            }
        }
    }

    // 설치하지 않는 경우
    dfs(ind + 1, cnt + 1, ins, sum);
}

void solve()
{
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> map[i][j];

            if (map[i][j] == 1)
            {
                // 가장자리 코어들은 제외
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    continue;

                core.push_back(node(i, j));
            }
        }
    }

    ans1 = 0;
    ans2 = INF;
    dfs(0, 0, 0, 0);

    cout << ans2 << "\n";
}

int main(void)
{

    int test_case;
    int T;
    freopen("sample_input1.txt", "r", stdin);
    cin >> T;

    /*
       여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
    */
    for (test_case = 1; test_case <= T; ++test_case)
    {
        fill(res, res + 10, false);
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}