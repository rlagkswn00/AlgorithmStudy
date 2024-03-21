#
# Title: BOJ 10867 중복 빼고 정렬하기
# Date: 24.03.21
#
import sys
input = sys.stdin.readline

n = int(input())
nums = set()
input_num = list(map(int,input().split()))

for i in input_num:
    nums.add(i)

linums = sorted(list(nums))

print(*linums)