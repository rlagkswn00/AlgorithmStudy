#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    string s;
    cin >> s;
    vector<int> result;

    for (char c = 'a'; c <= 'z'; c++)
    {
        int cnt = 0;
        for (auto c1 : s)
        {
            if (c == c1)
                cnt++;
        }
        cout << cnt << " ";
    }
}