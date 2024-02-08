#
# Title: BOJ 18808 스티거 붙이기
# Date: 24.02.08
#

import sys
input = sys.stdin.readline

R = 0
C = 0
cnt = 0
N,M,K = map(int,input().split())

board = [[0] * M for _ in range(N)]

#전체를 확인해서 가능한지 확인
#불가능하면 False 반환 : 스티커가 있는데 못 붙이면
#가능하면 1로 작성 : 스티커 크기만큼 반복
def possible(x, y):
    for i in range(R):
        for j in range(C):
            if board[x+i][y+j] == 1 and stickers[i][j] == 1:
                return False
            
    for i in range(R):
        for j in range(C):
            if stickers[i][j] == 1:
                board[x+i][y+j] = 1
    return True

#스티커 개수만큼 반복해서 붙임
for _ in range(K):
    R,C = map(int,input().split())
    #스티커 입력
    stickers = []
    for j in range(R):
        stickers.append(list(map(int,input().split())))
        
    #붙일경우를 위한 반복문 중지 플래그
    flag = False
    #4방향 순환
    for _ in range(4):
        for x in range(N-R+1):
            for y in range(M-C+1):
                if possible(x,y):
                    flag = True
                    break
                if flag:
                    break;
            if flag:
                break;
        if flag:
            break
        
        temp_stickers = stickers.copy()
        stickers = list(zip(*temp_stickers[::-1]))
        R,C = C,R
for i in range(N):
    for j in range(M):
        cnt += board[i][j]
        
print(cnt)
    
