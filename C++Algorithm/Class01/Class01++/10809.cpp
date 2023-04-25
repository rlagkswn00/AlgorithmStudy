/*
Title: BOJ 10809 알파벳 찾기
Theory : 구현, 문자열
Date: 23.04.25
*/

#include <iostream>
#include <string>

using namespace std;
int cnt[26];
string s;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    fill(cnt, cnt + 26, -1);

    cin >> s;
    for (int i = 0; i < s.length(); i++)
    {
        for (int j = 0; j < 26; j++)
        {
            if (s[i] == ('a' + j) && cnt[j] == -1)
                cnt[j] = i;
        }
    }
    for (int i = 0; i < 25; i++)
        cout << cnt[i] << " ";
    cout << cnt[25] << '\n';
    return 0;
}