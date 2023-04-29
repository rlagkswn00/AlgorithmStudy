/*
Title: BOJ 1978 소수 찾기
Theory : 수학, 정수론, 소수 판정
Date: 23.04.29
*/
#include <iostream>
using namespace std;

int N;
int cnt;
int result;
int main(void)
{
    cin >> N;
    int n;

    for (int i = 0; i < N; i++)
    {
        cin >> n;
        for (int j = 1; j < n + 1; j++)
        {
            if (n % j == 0)
                cnt++;
        }
        if (cnt == 2)
            result++;
        cnt = 0;
    }
    cout << result;
    return 0;
}