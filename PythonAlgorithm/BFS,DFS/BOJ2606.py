#
# Title: BOJ 2606 바이러스
# Date: 24.03.17
#
import sys
input = sys.stdin.readline
from collections import deque

n = int(input())
v = int(input())
adjl = [[] for _ in range(n+1)]
visited = [0] * (n+1)

for i in range(v):
    a,b = map(int,input().split())
    adjl[a].append(b)
    adjl[b].append(a)

q = deque([1])
visited[1] = 1

while q:
    cur = q.popleft()
    for next in adjl[cur]:
        if visited[next] == 0:
            q.append(next)
            visited[next] = 1
print(sum(visited) - 1)