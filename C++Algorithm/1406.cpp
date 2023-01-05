#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;
    int cnt;
    cin >> s;
    cin >> cnt;
    list<char> L;

    for (auto c : s)
        L.push_back(c);
    auto cursor = L.end();

    char cmd;
    while (cnt--)
    {
        cin >> cmd;
        if (cmd == 'L')
        {
            if (cursor != L.begin())
                cursor--;
        }
        else if (cmd == 'D')
        {
            if (cursor != L.end())
                cursor++;
        }
        else if (cmd == 'B')
        {
            if (cursor != L.begin())
            {
                cursor--;
                cursor = L.erase(cursor);
            }
        }
        else
        {
            char add_c;
            cin >> add_c;
            L.insert(cursor, add_c);
        }
    }
    for (auto c : L)
        cout << c;
}