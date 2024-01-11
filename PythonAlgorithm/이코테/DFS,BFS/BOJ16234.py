#
# Title: BOJ 16234 인구 이동
# Date: 24.01.11
#
import sys
input = sys.stdin.readline
from collections import deque

N,L,R = map(int,input().split())
board = [list(map(int,input().split())) for _ in range(N)]
adjl = [[] * N for _ in range(N)]
d = [[-1,0],[1,0],[0,-1],[0,1]]
total_count = 0
#특정 위치에서 출발하여 모든 연합을 체크한 뒤에 데이터 갱신
def process(x,y,index):
    united = [] #연합 리스트
    united.append((x,y)) # 시작점을 연합 추가
    
    #BFS 덱 생성
    q = deque()
    q.append((x,y)) #시작지점
    union[x][y] = board[x][y] #현재 연합 번호 할당
    summary = board[x][y] #현재 연합의 전체 인구 수
    count = 1 #현재 연합의 국가 수
    
    # BFS
    while q:
        x,y = q.popleft()
        for dx,dy in d:
            nx = x + dx
            ny = y + dy
            
            #범위 확인
            if nx < 0 or nx >= N or ny < 0 or ny >= N:
                continue
            
            #바로 옆 나라가 연합에 배정되어 있으면
            if union[nx][ny] != -1:
                continue
            
            # 인구 수 차이 계산
            gap = abs(board[nx][ny] - board[x][y])
            if gap < L or gap > R:
                continue
            
            # 국경선 해제 = 이동 => 탐색 대상, 연합 추가
            q.append((nx,ny)) # 다음 탐색
            union[nx][ny] = index #연합 추가, 연합 배열에 인덱스 추가
            summary += board[nx][ny] # 전체 총합
            count += 1 #연합 국가 수
            united.append((nx,ny)) # 현재 연합 배열
    
    # 인구이동
    for i,j in united:
        board[i][j] = summary // count
            
#더이상 인구 이동을 할 수 없음 = 모든 칸
while True:
    union = [[-1] * N for _ in range(N)] #연합정보를 저장하는 곳
    index = 0
    for i in range(N):
        for j in range(N):
            if union[i][j] == -1: #i,j가 연합이 배정되지 않으면 실행
                process(i,j,index)
                index += 1
    
    if index == N**2:
        break
    
    total_count += 1

print(total_count)