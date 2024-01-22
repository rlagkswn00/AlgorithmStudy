#
# Title: BOJ 15650 N과 M(2)
# Date: 24.01.22
#
import sys
input = sys.stdin.readline
N, M = map(int, input().split())
num_arr = [i for i in range(1, N+1)]
visited = [False] * N


def dfs(n, start):
    if n == M:
        for i in range(N):
            if visited[i]:
                print(num_arr[i], end=' ')
        print()
        return

    for i in range(start, N):
        if not visited[i]:
            visited[i] = True
            dfs(n+1, i+1)
            visited[i] = False


dfs(0, 0)
