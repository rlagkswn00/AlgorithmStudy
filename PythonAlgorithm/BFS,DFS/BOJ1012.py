#
# Title: BOJ 1012 유기농 배추
# Date: 24.02.03
#
import sys
input = sys.stdin.readline
from collections import deque

T = int(input())
d = [[1,0],[-1,0],[0,-1],[0,1]]

for _ in range(T):
    M,N,K = map(int,input().split())
    board = [[0] * M for _ in range(N)]

    for i in range(K):
        y,x = map(int,input().split())
        board[x][y] = 1
        
    q = deque()
    cnt = 0
    for i in range(N):
        for j in range(M):
            if board[i][j] == 1:
                cnt += 1
                q.append((i,j))
                
                while q:
                    x,y = q.popleft()
                    
                    for dd in d:
                        nx = x + dd[0]
                        ny = y + dd[1]
                        
                        if nx < 0 or nx >= N or ny < 0 or ny >= M:
                            continue
                        
                        if board[nx][ny] != 1:
                            continue
                        
                        board[nx][ny] = 2
                        q.append((nx,ny))
                        
    print(cnt)
    
    
    