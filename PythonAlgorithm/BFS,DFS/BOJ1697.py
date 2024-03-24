#
# Title: BOJ 1697 숨바꼭질
# Date: 24.03.21
#
import sys
from collections import deque

input = sys.stdin.readline

MAX = 10**5
N, K = map(int, input().split())
dist = [0] * (MAX + 1) # 100,000 index 배열 생성

q = deque()
q.append(N) # 시작점 넣기

while q:
    x = q.popleft()
    if x == K:
        print(dist[K]) # 목적지 도달하면 결과 출력
        break
    for nx in (x - 1, x + 1, x * 2): # 경우의 수 세가지 모두 탐색
        if nx < 0 or nx > MAX: # 범위 밖이면 continue
            continue
        if dist[nx] != 0: # 이미 방문했으면 continue
            continue
        dist[nx] = dist[x] + 1 # 결과 +1
        q.append(nx) # 다음 탐색시작지