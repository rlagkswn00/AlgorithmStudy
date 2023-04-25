/*
Title: BOJ 1152 단어의 개수
Theory : 구현, 문자열
Date: 23.04.25
*/

#include <iostream>
#include <string>

using namespace std;

string s;
int cnt;
int main(void)
{

    ios::sync_with_stdio(0);
    cin.tie(0);

    getline(cin, s);
    cnt = 1;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == ' ')
            cnt++;
    }
    if (s[0] == ' ')
        cnt--;
    if (s[s.length() - 1] == ' ')
        cnt--;
    cout << cnt;
    return 0;
}