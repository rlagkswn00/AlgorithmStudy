#
# Title: BOJ 11866 요세푸스 문제 0
# Theory : 구현, 자료 구조, 큐
# Date: 23.05.13
#
from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
Q = deque()
for i in range(n):
    Q.append(i+1)
result = []
while Q:
    for i in range(k-1):
        Q.append(Q.popleft())
    result.append(Q.popleft())

print("<", end="")
print(", ".join(map(str, result)), end="")
print(">")
