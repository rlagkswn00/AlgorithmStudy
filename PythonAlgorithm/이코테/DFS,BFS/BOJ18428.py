#
# Title: BOJ 18428 감시 피하기
# Date: 24.01.09
#
import sys
input = sys.stdin.readline

N = int(input())
board = []
teacher = []
flag = False
d = [[-1,0],[1,0],[0,-1],[0,1]]

#입력을 받으면서 특정 위치 지정하기.
#한줄씩 입력 받으면서 그 줄에 대해서 비교
for i in range(N):
    board.append(list(map(str,input().split())))
    for j in range(N):
        if board[i][j] == "T":
            teacher.append((i,j))            

#백트래킹 안에 bfs
#장애물을 세개 놓는 모든 경우의 수를 시도함.
#3개 놓았다 = cnt값이 3이다 = 탐색을 시도한다.
#bfs의 반환값이 True면 가능한 것이다.
def setting_huddle(cnt):
    global flag
    
    if flag:
        return
    
    if cnt == 3:
        if bfs():
            flag = True
            return
    else:
        for x in range(N):
            for y in range(N):
                if board[x][y] == "X":
                    board[x][y] = "O"
                    setting_huddle(cnt + 1)
                    board[x][y] = "X"

def bfs():
    for t in teacher:
        for next in d:
            x,y = t
            while 0 <= x < N and 0 <= y < N:
                if board[x][y] == "O":
                    break;
                if board[x][y] == "S":
                    return False
                x += next[0]
                y += next[1]    
    return True

setting_huddle(0)

if flag:
    print("YES")
else:
    print("NO")