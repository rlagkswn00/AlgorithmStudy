/*
Title: BOJ 2292 벌집
Theory : 수학
Date: 23.04.30
*/
#include <iostream>

using namespace std;

int n;

int main(void)
{
    cin >> n;
    int i = 1;
    int cnt = 1;

    while (n > i)
    {
        i += (6 * cnt);
        cnt++;
    }
    cout << cnt;
    return 0;
}