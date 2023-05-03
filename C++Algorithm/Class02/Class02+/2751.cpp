/*
Title: BOJ 2751 수 정렬하기 2
Theory :
Date: 23.05.03
*/
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int n;
vector<int> vec;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n;
    int tmp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        vec.push_back(tmp);
    }
    sort(vec.begin(), vec.end());
    for (int i = 0; i < vec.size(); i++)
        cout << vec[i] << '\n';
    return 0;
}