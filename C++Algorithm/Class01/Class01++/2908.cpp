/*
Title: BOJ 2908 상수
Theory : 구현, 수학
Date: 23.04.25
*/
#include <iostream>
#include <string>
using namespace std;

int main(void)
{

    ios::sync_with_stdio(0);
    cin.tie(0);
    string num1, num2;
    string newNum1, newNum2;
    cin >> num1 >> num2;
    for (int i = 0; i < num1.length(); i++)
    {
        newNum1 += num1[num1.length() - i - 1];
        newNum2 += num2[num2.length() - i - 1];
    }
    int n1 = stoi(newNum1);
    int n2 = stoi(newNum2);
    if (n1 > n2)
        cout << n1;
    else
        cout << n2;

    return 0;
}