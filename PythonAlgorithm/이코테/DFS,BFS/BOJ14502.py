#
# Title: BOJ 14502 연구소
# Date: 24.01.06
#
import sys
import copy
input = sys.stdin.readline
from collections import deque
    
def make_wall(count):
    if count == 3:
        bfs()
        return
    for i in range(n):
        for k in range(m):
            if board[i][k] == 0:
                board[i][k] = 1
                make_wall(count+1)
                board[i][k] = 0

def bfs():
    q = deque()
    test_board = copy.deepcopy(board)
    for i in range(n):
        for k in range(m):
            if test_board[i][k] == 2:
                q.append((i,k))
    
    while q:
        x, y = q.popleft()
        
        for i in range(4):
            nx = x+d[i][0]
            ny = y+d[i][1]
            
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            
            if test_board[nx][ny] == 0:
                test_board[nx][ny] = 2
                q.append((nx,ny))
    
    global result
    count = 0
    for i in range(n):
        for k in range(m):
            if test_board[i][k] == 0:
                count += 1
    result = max(result,count)

n, m = map(int, input().split())
board = [list(map(int,input().split())) for _ in range(n)]
d = [[-1,0],[1,0],[0,-1],[0,1]]
result = 0

make_wall(0)
print(result)