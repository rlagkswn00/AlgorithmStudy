#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;

    while (true)
    {
        bool isValid = true;
        stack<char> st;
        getline(cin, s);
        if (s == ".")
        {
            break;
        }
        for (auto c : s)
        {
            // cout << c << endl;
            if (c == '(')
            {
                st.push('(');
            }
            else if (c == '[')
            {
                st.push('[');
            }
            else if (c == ')')
            {
                if (!st.empty() && st.top() == '(')
                {
                    st.pop();
                }
                else
                {
                    isValid = false;
                    break;
                }
            }
            else if (c == ']')
            {
                if (!st.empty() && st.top() == '[')
                {
                    st.pop();
                }
                else
                {
                    isValid = false;
                    break;
                }
            }
        }
        if (!st.empty())
            isValid = false;
        if (isValid)
        {
            cout << "yes"
                 << "\n";
        }
        else
        {
            cout << "no"
                 << "\n";
        }
    }
}