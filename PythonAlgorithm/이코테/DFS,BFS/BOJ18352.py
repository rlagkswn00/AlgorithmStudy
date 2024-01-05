#
# Title: BOJ 18352 특정 거리의 도시 찾기
# Date: 24.01.05
#

import sys
from collections import deque
input = sys.stdin.readline

def bfs(x, adjl):
    q = deque([x])
    while q:
        nx = q.popleft()
        for i in adjl[nx]:
            if not visited[i]:
                visited[i] = True
                result[i] = result[nx] + 1
                q.append(i)

# 도시 개수, 도로 개수, 거리 정보, 출발지
n, m, k, x = map(int,input().split())

#인접 리스트 생성
#0생각하기 싫으니 +1칸 생성
adjl = [[] for _ in range(n+1)]

#도로 정보 저장
#출발 a 도착 b
for _ in range(m):
    a,b = map(int, input().split())
    adjl[a].append(b)

#방문 기록 리스트
visited = [False] * (n+1)

# 출발지 표시
visited[x] = True

# 최단거리 찾기
result = [0] * (n+1)

bfs(x,adjl)

exist = False
for i in range(1,n+1):
    if result[i] == k:
        exist = True
        print(i)
        
if not exist:
    print(-1)