#
# Title: BOJ 1932 정수 삼각형
# Date: 24.03.20
#
import sys
input = sys.stdin.readline

N = int(input())
triangle = [list(map(int, input().split())) for _ in range(N)]
dp = [[0] * (len(triangle[i])) for i in range(N)]

dp[0][0] = triangle[0][0]
if N == 1:
    print(triangle[0][0])
    exit(0)

dp[1][0] = dp[0][0] + triangle[1][0]
dp[1][1] = dp[0][0] + triangle[1][1]
    
for i in range(2, N):
    for j in range(i+1):
        if j == 0:
            dp[i][j] = dp[i-1][j] + triangle[i][j]
            continue
        if j == i:
            dp[i][j] = dp[i-1][j-1] + triangle[i][j]
            continue
        dp[i][j] = max(dp[i-1][j] + triangle[i][j], dp[i-1][j-1] + triangle[i][j])

print(max(dp[-1]))