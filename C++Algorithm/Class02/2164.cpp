/*
Title: BOJ 2164 카드2
Theory : 자료 구조, 큐
Date: 23.05.02
*/
#include <iostream>
#include <queue>
using namespace std;
int n;
queue<int> Q;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n;
    bool isOdd = true;
    for (int i = 0; i < n; i++)
    {
        Q.push(i + 1);
    }

    while (Q.size() != 1)
    {

        if (isOdd)
        {
            Q.pop();
            isOdd = false;
        }
        else
        {
            int tmp = Q.front();
            Q.pop();
            Q.push(tmp);
            isOdd = true;
        }
    }
    cout << Q.front();
    return 0;
}