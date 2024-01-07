#
# Title: BOJ 18405 경쟁적 전염
# Date: 24.01.07
#
import sys
input = sys.stdin.readline
from collections import deque

n,k = map(int,input().split())
board = [list(map(int,input().split())) for _ in range(n)]
s, posx, posy = map(int,input().split())
start_point = []

for i in range(n):
    for j in range(n):
        if board[i][j] != 0:
            start_point.append((board[i][j],i,j,0))
            
start_point.sort()
d = [[1,0],[-1,0],[0,1],[0,-1]]
q = deque(start_point)

while q:
    num, x, y, time = q.popleft()
    if time == s:
        break
    
    for i in range(4):
        nx = x + d[i][0]
        ny = y + d[i][1]
        
        if nx >= n or nx < 0 or ny >= n or ny < 0:
            continue
        
        if board[nx][ny] != 0:
            continue
        
        board[nx][ny] = num
        start_point.append((board[nx][ny],nx,ny,time+1))


print(board[posx-1][posy-1])