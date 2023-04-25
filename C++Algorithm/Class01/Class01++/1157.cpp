/*
Title: BOJ 1157 단어 공부
Theory : 구현, 문자열
Date: 23.04.25
*/

#include <iostream>
#include <string>
using namespace std;

string s;
int cnt[26];
int maximum, maxIdx;
int maxCnt;
int main(void)
{

    ios::sync_with_stdio(0);
    cin.tie(0);

    getline(cin, s);
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] < 97)
            cnt[s[i] - 65]++;
        else
            cnt[s[i] - 97]++;
    }
    for (int i = 0; i < 26; i++)
    {
        if (maximum < cnt[i])
        {
            maximum = cnt[i];
            maxIdx = i;
        }
    }
    for (int i = 0; i < 26; i++)
        if (maximum == cnt[i])
            maxCnt++;

    if (maxCnt > 1)
        cout << '?';
    else
        cout << (char)(maxIdx + 65);
    return 0;
}