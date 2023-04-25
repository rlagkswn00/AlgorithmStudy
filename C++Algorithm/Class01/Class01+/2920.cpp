/*
Title: BOJ 2920 음계
Theory : 구현
Date: 23.04.24
*/

#include <iostream>
using namespace std;

int prev_num;
int num;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> num;
    if (num == 1 || num == 8)
    {
        prev_num = num;
    }
    else
    {
        cout << "mixed";
        return 0;
    }
    for (int i = 1; i < 8; i++)
    {
        cin >> num;
        if (num != prev_num + 1 && num != prev_num - 1)
        {
            cout << "mixed";
            return 0;
        }
        prev_num = num;
    }
    if (num == 1)
        cout << "descending";
    else
        cout << "ascending";
    return 0;
}