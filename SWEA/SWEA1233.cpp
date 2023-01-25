// [S/W 문제해결 기본] 9일차 - 사칙연산 유효성 검사
#include <bits/stdc++.h>
using namespace std;

int n, leftNum, rightNum;
char input;
void solve()
{
    cin >> n;
    int result = 1;

    for (int i = 1; i < n + 1; i++)
    {
        cin >> i >> input;
        if (i <= n / 2)
        {
            if (i == n / 2 && n % 2 == 0)
                cin >> leftNum;
            else
                cin >> leftNum >> rightNum;

            if (input >= '0' && input <= '9')
                result = 0;
        }
        else
        {
            if (!(input >= '0' && input <= '9'))
                result = 0;
        }
    }
    cout << result << '\n';
}

int main(void)
{

    int test_case;
    int T = 10;
    freopen("sample_input2.txt", "r", stdin);

    /*
       여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
    */
    for (test_case = 1; test_case <= T; ++test_case)
    {
        cout << "#" << test_case << " ";
        solve();
    }
    return 0; // 정상종료시 반드시 0을 리턴해야합니다.
}