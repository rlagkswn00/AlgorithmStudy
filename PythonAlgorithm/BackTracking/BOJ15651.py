#
# Title: BOJ15651 N과 M(3)
# Date: 24.01.23
#
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
num_arr = [i for i in range(1, N+1)]
out_arr = []


def dfs(depth):
    if depth == M:
        print(*out_arr)
        return
    for i in range(N):
        out_arr.append(num_arr[i])
        dfs(depth+1)
        out_arr.pop()


dfs(0)
