// 0/1 Knapsack - DP
#include <bits/stdc++.h>
using namespace std;
int dp[101][1001]; // 물건의 개수x, 부피가 y이고 같은 부피에 최대 가치를 저장
int n, k;
int v[101], c[101];
void init()
{
    memset(dp, 0, sizeof(dp));
    n = 0;
    k = 0;
}
void solve()
{
    cin >> n >> k;
    for (int i = 1; i < n + 1; i++)
        cin >> v[i] >> c[i];

    for (int i = 1; i < n + 1; i++)
    {
        for (int j = 1; j < k + 1; j++)
        {
            if (v[i] > j)
                dp[i][j] = dp[i - 1][j];
            else
                dp[i][j] = max(c[i] + dp[i - 1][j - v[i]], dp[i - 1][j]);
        }
    }
    cout << dp[n][k] << "\n";
}
int main(void)
{

    int test_case;
    int T;
    freopen("sample_input2.txt", "r", stdin);
    cin >> T;

    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}