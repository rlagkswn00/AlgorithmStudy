#
# Title: 이코테 성적이 낮은 순서로 학생 출력하기
# Date: 24.01.04
#

import sys
input = sys.stdin.readline

n = int(input())
arr = []
for _ in range(n):
    arr.append(tuple(input().split()))

arr = sorted(arr, key = lambda x:x[1])
for item in arr:
    print(item[0], end=' ')