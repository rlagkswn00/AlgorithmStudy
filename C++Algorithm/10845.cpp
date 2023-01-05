#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    queue<int> q;
    int n;
    cin >> n;
    string op;

    while (n--)
    {
        cin >> op;
        if (op == "push")
        {
            int num;
            cin >> num;
            q.push(num);
        }
        else if (op == "pop")
        {
            if (q.empty())
            {
                cout << -1 << "\n";
            }
            else
            {
                cout << q.front() << "\n";
                q.pop();
            }
        }
        else if (op == "size")
        {
            cout << q.size() << "\n";
        }
        else if (op == "empty")
        {
            cout << q.empty() << "\n";
        }
        else if (op == "front")
        {
            if (!q.empty())
            {
                cout << q.front() << "\n";
            }
            else
            {
                cout << -1 << "\n";
            }
        }
        else
        {
            if (!q.empty())
                cout << q.back() << "\n";
            else
                cout << -1 << "\n";
        }
    }
}