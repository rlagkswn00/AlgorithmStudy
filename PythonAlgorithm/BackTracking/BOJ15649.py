#
# Title: BOJ 15649 N과 M(1)
# Date: 24.01.21
#
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
visited = [False] * (N+1)
num_arr = [i for i in range(1, N+1)]
out_arr = []


def dfs(depth):
    if depth == M:
        print(' '.join(map(str, out_arr)))
        return

    for i, e in enumerate(num_arr):
        if not visited[i]:
            visited[i] = True
            out_arr.append(e)
            dfs(depth+1)
            out_arr.pop()
            visited[i] = False


dfs(0)
