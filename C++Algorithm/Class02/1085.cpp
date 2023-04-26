/*
Title: BOJ 1085 직사각형 탈출
Theory : 수학, 기하학
Date: 23.04.26
*/
#include <iostream>
#include <utility>
#include <cmath>
using namespace std;
pair<int, int> xy, wh;
int main(void)
{
    cin >> xy.first >> xy.second >> wh.first >> wh.second;
    int val1 = min(xy.first, xy.second);
    int val2 = min(wh.first - xy.first, wh.second - xy.second);
    cout << min(val1, val2);
    return 0;
}