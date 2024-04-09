#
# Title: BOJ 1753 최단경로
# Date: 24.04.09
#
import sys
import heapq
input = sys.stdin.readline

def dijkstra(start):
    #시작지는 가중치 0
    dp[start] = 0
    heapq.heappush(heap,(0,start)) # 힙에 추가 (정점, 가중치)
    
    while heap:
        weight, point = heapq.heappop(heap) # 정점, 가중치
        
        if dp[point] < weight: # 정점까지의 거리가 더 크면 넘김
            continue
         # 시작지 기준으로, 다음 위치, 현재 위치에서 다음 위치로의 가중치를 모두 갖고와서 반복
        for next_node, next_weight in graph[point]:
            sum_weight = weight + next_weight # 여태까지 온 거리 + 다음 거리 
            if sum_weight < dp[next_node]: #건너오는게 바로 오는 것보다 작담녀 최신화 해야 함
                dp[next_node] = sum_weight 
                heapq.heappush(heap,(sum_weight,next_node)) # 다음 탐색할 내용

# 정점, 간선 개수 입력
V,E = map(int,input().split())
# 시작점 위치 입력
K = int(input())
#최대값 설정
INF = sys.maxsize
#경로 가중치 테이블
dp = [INF] * (V+1)
#heap 생성
heap = []
#그래프 생성(정점 개수 + 1)
graph = [[] for _ in range(V+1)]

#그래프 초기화
for i in range(E):
    u,v,w = map(int,input().split())
    #graph[시작지] = (목적지, 가중치)
    graph[u].append((v,w))

dijkstra(K)
for i in range(1,V+1):
    if dp[i] == INF:
        print("INF")
    else:
        print(dp[i])