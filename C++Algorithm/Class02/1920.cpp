/*
Title: BOJ 1920 수 찾기
Theory : 자료구조, 정렬, 이분 탐색
Date: 23.05.02
*/
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int n, m;
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

    cin >> m;
    for (int i = 0; i < m; i++)
    {
        cin >> tmp;
        bool isPrint = false;
        int midIdx = vec.size() / 2;
        int leftIdx = 0;
        int rightIdx = vec.size() - 1;
        while (leftIdx <= rightIdx)
        {
            midIdx = (leftIdx + rightIdx) / 2;
            int mid = vec[midIdx];
            if (tmp == mid)
            {
                cout << "1" << '\n';
                isPrint = true;
                break;
            }
            else if (mid > tmp)
            {
                rightIdx = midIdx - 1;
            }
            else
            {
                leftIdx = midIdx + 1;
            }
        }
        if (!isPrint)
            cout << "0" << '\n';
    }
    return 0;
}