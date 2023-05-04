/*
Title: BOJ 4153 직각삼각형
Theory : 수학, 기하학, 피타고라스 정리
Date: 23.05.03
*/
#include <iostream>

using namespace std;
int a, b, c;
int main(void)
{
    while (true)
    {
        cin >> a >> b >> c;
        if (a == 0 && b == 0 && c == 0)
            break;
        if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((b * b) + (c * c)) == (a * a))
            cout << "right\n";
        else
            cout << "wrong\n";
    }
    return 0;
}