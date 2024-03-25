#
# Title: BOJ 1149 RGB거리
# Date: 24.03.25
#
import sys
input = sys.stdin.readline

N = int(input())
dist = []
for _ in range(N):
    dist.append(list(map(int,input().split())))

dp = [[] for _ in range(N)]
dp[0] = dist[0]
for i in range(1,N):
    dp[i].append(dist[i][0] + min(dp[i-1][1],dp[i-1][2]))
    dp[i].append(dist[i][1] + min(dp[i-1][0],dp[i-1][2]))
    dp[i].append(dist[i][2] + min(dp[i-1][0],dp[i-1][1]))
print(min(dp[N-1]))