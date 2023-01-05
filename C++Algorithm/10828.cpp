#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<int> st;
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
            st.push(num);
        }
        else if (op == "pop")
        {
            if (st.empty())
            {
                cout << -1 << "\n";
            }
            else
            {
                cout << st.top() << "\n";
                st.pop();
            }
        }
        else if (op == "top")
        {
            if (st.empty())
            {
                cout << -1 << "\n";
            }
            else
            {
                cout << st.top() << "\n";
            }
        }
        else if (op == "empty")
        {
            if (st.empty())
            {
                cout << 1 << "\n";
            }
            else
            {
                cout << 0 << "\n";
            }
        }
        else
        {
            cout << st.size() << "\n";
        }
    }
}