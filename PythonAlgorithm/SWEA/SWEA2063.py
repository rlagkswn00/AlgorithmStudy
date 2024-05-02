#
# Title: SWEA 2063 중간값 찾기
# Date: 24.05.02
#

N = int(input())
nums = list(map(int,input().split()))
nums.sort()
result = nums[N//2]

print(result)
