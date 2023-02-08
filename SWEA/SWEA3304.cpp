#include <bits/stdc++.h>

using namespace std;
int dp[1001][1001];
string input1, input2;
int result;

void init()
{
    memset(dp, 0, sizeof(dp));
    result = 0;
}

void solve()
{
    init();
    cin >> input1 >> input2;
    for (int i = 1; i < input1.length() + 1; i++)
    {
        for (int j = 1; j < input2.length() + 1; j++)
        {
            if (input1[i - 1] == input2[j - 1])
            {
                dp[i][j] = dp[i - 1][j - 1] + 1;
            }
            else
            {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }
    for (int i = 0; i < 1001; i++)
    {
        for (int j = 0; j < 1001; j++)
        {
            if (result < dp[i][j])
                result = dp[i][j];
        }
    }
    cout << result << "\n";
}

int main(int argc, char **argv)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int test_case;
    int T;
    freopen("sample_input1.txt", "r", stdin);
    cin >> T;

    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << '#' << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}
