#
# Title: BOJ 15655 N과 M(6)
# Date: 24.01.24
#
import sys
input = sys.stdin.readline
N, M = map(int, input().split())
num_arr = list(map(int, input().split()))
num_arr.sort()
visited = [False] * N


def dfs(depth, nextIdx):
    if depth == M:
        for i in range(N):
            if visited[i]:
                print(num_arr[i], end=' ')
        print()

    for i in range(nextIdx, N):
        if not visited[i]:
            visited[i] = True
            dfs(depth+1, i+1)
            visited[i] = False


dfs(0, 0)
