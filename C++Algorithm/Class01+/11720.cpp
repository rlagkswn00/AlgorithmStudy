/*
Title: BOJ 11720 숫자의 합
Theory : 구현
Date: 23.04.24
*/

#include <iostream>
#include <string>
using namespace std;
int N;
int sum;
string num;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> N;
    cin >> num;
    for (int j = 0; j < N; j++)
        sum += num[j] - '0';

    cout << sum;
}