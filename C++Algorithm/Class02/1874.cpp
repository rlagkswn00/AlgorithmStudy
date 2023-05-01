/*
Title: BOJ 1874 스택 수열
Theory : 자료구조, 스택
Date: 23.05.01
*/
#include <iostream>
#include <stack>
#include <vector>

using namespace std;
stack<int> st;
vector<char> vec;

int n;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int cnt = 1;
    cin >> n;
    int x = 0;

    for (int i = 0; i < n; i++)
    {
        cin >> x;
        while (cnt <= x)
        {
            st.push(cnt++);
            vec.push_back('+');
        }
        if (st.top() == x)
        {
            st.pop();
            vec.push_back('-');
        }
        else
        {
            cout << "NO";
            return 0;
        }
    }
    for (auto c : vec)
    {
        cout << c << '\n';
    }

    return 0;
}