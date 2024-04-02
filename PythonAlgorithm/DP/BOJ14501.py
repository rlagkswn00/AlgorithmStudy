#
# Title: BOJ 14501 퇴사
# Date: 24.04.02
#
import sys
input = sys.stdin.readline
n = int(input())

tasks = []
for _ in range(n):
    tasks.append(tuple(map(int, input().split())))
tasks.append((0, 0))
tasks.reverse()

dp = [0] * (n+1)

for i in range(1, n+1):
    time = tasks[i][0]
    value = tasks[i][1]
    if i < time:  # 남은 시간보다 현재 상담의 소요시간이 더 크면 안됨
        dp[i] = dp[i-1]
        continue
    dp[i] = max(dp[i-1], value + dp[i-time])

print(dp[n])
