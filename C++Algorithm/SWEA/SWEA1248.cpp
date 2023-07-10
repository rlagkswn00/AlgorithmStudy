// [S/W 문제해결 기본] 9일차 - 공통조상
#include <bits/stdc++.h>
using namespace std;
#define MAX 10010

typedef struct Node
{
    int num;
    int index;
    int parent;
    int child[2];
} Node;

int v, e, start[2], answerNode, subSize;
int dis[MAX][2];
Node tree[MAX];

void DFS(int node, int cnt, int index)
{
    dis[node][index] = cnt;
    if (tree[node].parent != 0)
    {
        DFS(tree[node].parent, cnt + 1, index);
    }
}

int BFS(int n)
{
    queue<int> Q;
    Q.push(n);
    int cnt = 1;

    while (Q.empty() == 0)
    {
        int cur = Q.front();
        Q.pop();

        for (int i = 0; i < 2; i++)
        {
            if (tree[cur].child[i] != 0)
            {
                Q.push(tree[cur].child[i]);
                cnt++;
            }
        }
    }
    return cnt;
}

void solve()
{
    for (int i = 0; i < MAX; i++)
    {
        tree[i].num = i;
        tree[i].index = 0;
        tree[i].parent = tree[i].child[0] = tree[i].child[1] = 0;
    }
    memset(dis, 0, sizeof(dis));

    cin >> v >> e >> start[0] >> start[1];
    for (int i = 0; i < e; i++)
    {
        int parent;
        cin >> parent;
        int child;
        cin >> child;

        tree[parent].child[tree[parent].index++] = child;
        tree[child].parent = parent;
    }

    for (int i = 0; i < 2; i++)
        DFS(start[i], 0, i);

    int tempDis[2] = {987654321, 987654321};
    for (int i = 1; i <= v; i++)
    {
        if (dis[i][0] != 0 && dis[i][1] != 0)
        {
            if (dis[i][0] < tempDis[0] && dis[i][1] < tempDis[1])
            {
                tempDis[0] = dis[i][0];
                tempDis[1] = dis[i][1];
                answerNode = i;
            }
        }
    }

    subSize = BFS(answerNode);
    cout << answerNode << " " << subSize << '\n';
}

int main(void)
{
    int test_case;
    int T;

    freopen("sample_input4.txt", "r", stdin);
    cin >> T;

    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}