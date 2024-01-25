#
# Title: BOJ 15663 N과 M(9)
# Date: 24.01.25
#

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
num_arr = sorted(list(map(int, input().split())))
visited = [False] * N
out_arr = []


def dfs(depth):
    if depth == M:
        print(*out_arr)
        return
    prev_num = 0
    for i in range(N):
        if not visited[i] and prev_num != num_arr[i]:
            visited[i] = True
            prev_num = num_arr[i]
            out_arr.append(num_arr[i])
            dfs(depth+1)
            visited[i] = False
            prev_num = num_arr[i]
            out_arr.pop()


dfs(0)
