/*
Title: BOJ 1259 팰린드롬수
Theory : 구현, 문자열
Date: 23.04.27
*/
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
string input;

int main(void)
{
    while (true)
    {
        cin >> input;
        if (input == "0")
            break;
        string revinput = input;
        reverse(input.begin(), input.end());
        if (revinput == input)
        {
            cout << "yes\n";
        }
        else
        {
            cout << "no\n";
        }
    }
    return 0;
}