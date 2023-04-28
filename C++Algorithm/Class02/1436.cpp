/*
Title: BOJ 1436 영화감독 숌
Theory : 브루트포스 알고리즘
Date: 23.04.28
*/
#include <iostream>
#include <string>
using namespace std;
int input;
int main(void)
{
    cin >> input;
    int num = 666;

    int cnt = 0;
    int result = 0;
    while (cnt != input)
    {

        if (to_string(num).find("666") != string::npos)
        {
            cnt++;
            result = num;
        }
        num++;
    }

    cout << result;
    return 0;
}