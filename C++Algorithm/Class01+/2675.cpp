/*
Title: BOJ 2675 문자열 반복
Theory : 구현, 문자열
Date: 23.04.24
*/

#include <iostream>
#include <string>
using namespace std;
int T, R;
string s;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> T;
    for (int i = 0; i < T; i++)
    {
        cin >> R >> s;
        for (int k = 0; k < s.length(); k++)
            for (int j = 0; j < R; j++)
                cout << s[k];

        cout << '\n';
    }
}