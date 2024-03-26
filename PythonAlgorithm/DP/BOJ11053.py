#
# Title: BOJ 11053 가장 긴 증가하는 부분 수열
# Date: 24.03.26
#
import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int,input().split()))

dp = [1] * N

for i in range(1,N):
    for j in range(i):
        if nums[i] > nums[j]:
            dp[i] = max(dp[i], dp[j]+1)
print(max(dp))