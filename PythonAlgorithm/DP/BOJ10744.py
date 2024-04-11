#
# Title: BOJ 10744 쉬운 계단 수
# Date: 24.04.11
#
import sys
input = sys.stdin.readline
mod = 1000000000
N = int(input())
dp = [[0] * 11 for _ in range(102)]
for i in range(1,10):
    dp[1][i] = 1

for i in range(2,101):
    for j in range(10):
        dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]

print(sum(dp[N])% mod)
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
# 10 -1
# 12 10
# 21 23
# 34 32
# 45 43
# 54 56
# 65 67
# 76 78
# 89 87 
# 98
#17개
# 9 * 2 - 1
# 101 121 123
# 210 212 232 234
# 343 345 321 323
# 4
# 5
# 6
# 7
# 8 
# 989 987
#33개   
# 17 * 2 - 1