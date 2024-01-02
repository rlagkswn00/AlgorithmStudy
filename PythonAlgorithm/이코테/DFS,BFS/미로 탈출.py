#
# Title: 이코테 미로탈출
# Date: 24.01.02
#

#덱 사용
from collections import deque

# 입력 속도 향상
import sys
input = sys.stdin.readline
import time

n, m = map(int,input().split())
graph = []
for i in range(n):
    graph.append(list(map(int,input().split())))

#방향 배열
dx = [-1,1,0,0]
dy = [0,0,-1,1]

#bfs
def bfs(x,y):
    q = deque()
    q.append((x,y))
    
    #큐가 빌 때까지
    while q:
        x,y = q.popleft()
        for i in range(4):
            
            nx = x + dx[i]
            ny = y + dy[i]
            #범위밖
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            
            #방문 하지 못하는 곳
            if graph[nx][ny] == 0:
                continue
        
            # 방문하지 않은 길 = 방문해서 업데이트
            if graph[nx][ny] == 1:
                # 이전 까지 오는데 걸린 거리 + 한칸
                graph[nx][ny] = graph[x][y] + 1
                q.append((nx,ny))
            
    # 마지막 결과 리턴
    return graph[n-1][m-1]

print(bfs(0,0))