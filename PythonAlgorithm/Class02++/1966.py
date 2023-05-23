#
# Title: BOJ 1966 프린터 큐
# Theory : 구현, 자료 구조, 시뮬레이션, 큐
# Date: 23.05.23
#

import sys
from collections import deque

input = sys.stdin.readline

T = int(input())

for i in range(T):
    n, m = map(int, input().split())
    q = deque(list(map(int, input().split())))
    cnt = 0

    while q:
        best = max(q)
        front = q.popleft()
        m -= 1

        if front == best:
            cnt += 1
            if m < 0:
                print(cnt)
                break

        else:
            q.append(front)
            if m < 0:
                m = len(q)-1
