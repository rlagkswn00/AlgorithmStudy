/*
Title: BOJ 1181 단어 정렬
Theory : 문자열, 정렬
Date: 23.04.25
*/
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;
vector<string> vec;

bool compare2(string a, string b)
{
    if (a.length() == b.length())
    {
        return a < b;
    }
    else
    {
        return a.length() < b.length();
    }
}
int main(void)
{
    int n = 0;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string s;
        cin >> s;
        if (find(vec.begin(), vec.end(), s) == vec.end())
            vec.push_back(s);
    }
    sort(vec.begin(), vec.end(), compare2);
    for (int i = 0; i < vec.size(); i++)
        cout << vec[i] << '\n';
    return 0;
}