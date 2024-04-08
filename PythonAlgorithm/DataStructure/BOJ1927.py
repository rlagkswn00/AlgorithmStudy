#
# Title: BOJ 1927 최소 힙
# Date: 24.04.08
#
import sys
import heapq

input = sys.stdin.readline

N = int(input())

heap = []
for i in range(N):
    x = int(input())
    if x == 0:
        if len(heap) == 0:
            print(0)
            continue
        print(heapq.heappop(heap))
        continue
    heapq.heappush(heap,x)