#
# Title: BOJ 2293 동전 1
# Date: 24.04.26
#
import sys
input = sys.stdin.readline

n,k = map(int,input().split())
coins = []
for _ in range(n):
    coins.append(int(input()))

dp = [0] * (k+1)
dp[0] = 1
#1. 모든 coin에 대해서 각 코인을 사용했을 떄 경우의 수를 중첩 계산
#2. c : 1,2,5 -> 1원, 1원/2원, 1원/2원/5원 사용한 경우
#3. dp[i] = dp[i] + dp[i-c] : i금액에 대해 1원만 사용한 경우 + i-1원만 사용한 경우를 c원을 사용한 경우
for c in coins:
    for i in range(c,k+1):
        dp[i] = dp[i] + dp[i-c]
print(dp[k])