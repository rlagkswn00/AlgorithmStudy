#
# Title: BOJ 10816 숫자카드 2
# Theory :자료 구조, 정렬, 이분 탐색, 해시를 사용한 집합과 맵
# Date: 23.05.13
#

import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(list(map(int, input().split())))
m = int(input())
arr2 = list(map(int, input().split()))

cnt = {}

for i in arr:
    if i in cnt:
        cnt[i] += 1
    else:
        cnt[i] = 1

for i in arr2:
    val = cnt.get(i)
    if val == None:
        print(0, end=" ")
    else:
        print(val, end=" ")
