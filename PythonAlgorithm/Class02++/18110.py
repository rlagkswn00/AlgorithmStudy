#
# Title: BOJ 18110 solved.ac
# Theory : 수학, 구현, 정렬
# Date: 23.07.06
#
import sys
import math
from collections import deque


def round2(n):
    return int(n) + 1 if n - int(n) >= 0.5 else int(n)


input = sys.stdin.readline
n = int(input())
if not n:
    print(0)
else:
    levelList = []
    for _ in range(n):
        levelList.append(int(input()))

    outBound = round2(n * 0.15)
    levelList.sort()
    levelList = deque(levelList)
    for _ in range(outBound):
        levelList.popleft()
        levelList.pop()

    avg = round2(sum(list(levelList)) / (n - 2 * outBound))

    print(avg)
