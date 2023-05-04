/*
Title: BOJ 2798 블랙잭
Theory : 브루트포스 알고리즘
Date: 23.05.03
*/
#include <iostream>
#include <vector>

using namespace std;

int n, m;
vector<int> vec;
int main(void)
{
    cin >> n >> m;
    int sum = 0;
    int maxSum = 0;
    int tmp = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        vec.push_back(tmp);
    }
    for (int i = 0; i < n; i++)
    {
        sum += vec[i];
        for (int j = 0; j < n; j++)
        {
            if (i == j)
                continue;
            sum += vec[j];
            for (int k = 0; k < n; k++)
            {
                if (j == k || k == i)
                    continue;
                sum += vec[k];
                if (sum > maxSum && sum <= m)
                    maxSum = sum;
                sum -= vec[k];
            }
            sum -= vec[j];
        }
        sum -= vec[i];
    }
    cout << maxSum;
    return 0;
}