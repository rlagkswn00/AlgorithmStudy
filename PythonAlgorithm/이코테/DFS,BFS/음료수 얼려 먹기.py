#
# Title: 이코테 음료수 얼려 먹기
# Date: 24.01.02
#

# 입력 속도 증가
import sys
input = sys.stdin.readline

#2차원 정보 리스트로 입력 받기
n,m = map(int,input().split())

graph = []
for i in range(n):
    graph.append(list(map(int,input().split())))

#DFS이용
def dfs(x,y):
    #종료조건
    if x<= -1 or x >= n or y <= -1 or y>= m:
        return False
    
    #현재 노드 방문 여부
    if graph[y][x] == 0:
        graph[y][x] = 1
        #상하좌우의 위치 모두 실행
        dfs(x-1,y)
        dfs(x,y-1)
        dfs(x+1,y)
        dfs(x,y+1)
        return True
    return False

#모든 위치에 dfs탐색
#탐색 = 음료수 채우기 = 얼음 생성 가능하면 카운팅
#T/F 값으로 구분
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i,j) == True:
            result+=1
print(result)