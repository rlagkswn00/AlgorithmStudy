/*
Title: BOJ 10250 ACM 호텔
Theory : 수학, 구현, 사칙연산
Date: 23.05.03
*/
#include <iostream>

using namespace std;
int h, w, n, T;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> T;
    while (T--)
    {
        cin >> h >> w >> n;
        int loch = n / h;
        int floor = n % h;
        if (floor == 0)
        {
            cout << h * 100 + loch << '\n';
        }
        else
        {
            cout << floor * 100 + loch + 1 << '\n';
        }
    }
    return 0;
}