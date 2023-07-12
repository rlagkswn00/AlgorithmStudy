#
# Title: BOJ 11279 최대 힙
# Theory : 자료 구조, 우선순위 큐
# Date: 23.07.09
#
import heapq as hq
import sys
input = sys.stdin.readline

n = int(input())
heap = []
for i in range(n):
    x = int(input())
    if x:
        # heappush 간 기본 값은 최소 힙으로 구성됨
        # 최대 힙 구성을 위해 튜플 형식으로 구성하여
        # 튜플[0]을 -값으로 작성하여 최대 힙 형식으로 만듦
        hq.heappush(heap, -x)
        # print(heap)
    else:
        if heap:
            print(-hq.heappop(heap))
        else:
            print(0)
