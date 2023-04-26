/*
Title: BOJ 1018 체스판 칠하기
Theory : 브루트포스 알고리즘
Date: 23.04.26
*/

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string s[50];
int N, M, cnt;

string WB[8] = {
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW"};
string BW[8] = {
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB"};

int WB_cnt(int x, int y)
{
    int cnt = 0;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (s[x + i][y + j] != WB[i][j])
                cnt++;
        }
    }
    return cnt;
}

int BW_cnt(int x, int y)
{
    int cnt = 0;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (s[x + i][y + j] != BW[i][j])
                cnt++;
        }
    }
    return cnt;
}
int main(void)
{
    int min_val = 11111;
    cin >> N >> M;

    for (int i = 0; i < N; i++)
        cin >> s[i];

    // 8칸씩 볼 scope 설정
    for (int i = 0; i + 8 <= N; i++)
        for (int j = 0; j + 8 <= M; j++)
        {
            int tmp;
            tmp = min(WB_cnt(i, j), BW_cnt(i, j));
            if (tmp < min_val)
                min_val = tmp;
        }
    cout << min_val;
    return 0;
}